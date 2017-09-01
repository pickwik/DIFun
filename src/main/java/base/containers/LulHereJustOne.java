package base.containers;

import java.util.HashMap;
import java.util.Map;

public class LulHereJustOne {
    private Map<String, Object> beanStorage;

    public LulHereJustOne() {
        this.beanStorage = new HashMap<>();
    }

    public void addBean(String name, Object bean) {
        beanStorage.put(name, bean);
    }

    public Object getBean(String name) {
        return beanStorage.get(name);
    }

    public <T> T getBean(String name,Class<T> tClass){
        return (T)this.getBean(name);
    }

    public Map<String, Object> getBeanStorage() {
        return beanStorage;
    }

    public void setBeanStorage(Map<String, Object> beanStorage) {
        this.beanStorage = beanStorage;
    }
}
