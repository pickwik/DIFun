package base;

import base.containers.LulHereJustOne;
import base.util.DirContainer;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class AnnotationProcessor {
    private static LulHereJustOne beanContainer = new LulHereJustOne();

    public static App instantiateBeansAndStartTheApp(String packageName) {
        DirContainer baseDirContainer = null;
        try {
            baseDirContainer = getClassesFromPackageRecursively(packageName);
        } catch (URISyntaxException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new App();
    }

    private static DirContainer getClassesFromPackageRecursively(String packageName) throws ClassNotFoundException, URISyntaxException {
        DirContainer dirContainer = new DirContainer(packageName);
        String relativePath = packageName.replace('.', '/');
        URL path = ClassLoader.getSystemClassLoader().getResource(relativePath);
        if (path == null) return dirContainer;
        File dir = new File(path.toURI());
        if (dir.exists()) {
            String[] fileList = dir.list();
            if (fileList == null) throw new RuntimeException("kek");
            for (String fileName : fileList) {
                if (fileName.endsWith(".class")) {
                    dirContainer.getClassContainer().addClass(Class.forName(packageName + "." + fileName.substring(0, fileName.indexOf(".class"))));
                } else {
                    String deeperPackage = packageName + "." + fileName;
                    if(!"base.annotations".equals(deeperPackage))dirContainer.addDirContainer(getClassesFromPackageRecursively(deeperPackage));
                }
            }
        }
        return dirContainer;
    }
}
