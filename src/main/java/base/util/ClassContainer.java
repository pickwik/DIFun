package base.util;

import java.util.ArrayList;
import java.util.List;

public class ClassContainer {
    private String packageName;
    private List<Class> classes;

    public ClassContainer(String packageName) {
        this.packageName = packageName;
        this.classes = new ArrayList<>();
    }
    public boolean addClass(Class clazz){
        return classes.add(clazz);
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return packageName;
    }
}
