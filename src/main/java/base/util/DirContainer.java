package base.util;

import java.util.ArrayList;
import java.util.List;

public class DirContainer {
    private String packageName;
    private ClassContainer classContainer;
    private List<DirContainer> dirContainers;

    public DirContainer(String packageName) {
        this.packageName = packageName;
        this.classContainer = new ClassContainer(packageName);
        this.dirContainers = new ArrayList<>();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public ClassContainer getClassContainer() {
        return classContainer;
    }

    public void setClassContainer(ClassContainer classContainer) {
        this.classContainer = classContainer;
    }

    public boolean addDirContainer(DirContainer dirContainer){
        return dirContainers.add(dirContainer);
    }

    public List<DirContainer> getDirContainers() {
        return dirContainers;
    }

    @Override
    public String toString() {
        return packageName;
    }
}
