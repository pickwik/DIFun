package base;

import base.annotations.Autowire;
import base.app.beans.SomeBeanUser;

public class App {


    @Autowire
    private SomeBeanUser someBeanUser;

    public static void main(String... args) {
        App app = AnnotationProcessor.instantiateBeansAndStartTheApp("base");
        app.doSomeNonStaticStuff();
    }

    public void doSomeNonStaticStuff() {
        System.out.println("SomeBeanUser->NotSoAwesomeBean->WowSoMuchInt=" + someBeanUser.getNotSoAwesomeBean().getWowSoMuchInt());
        System.out.println("SomeBeanUser->SomeAwesomeBean->BestStringInTheWorld=" + someBeanUser.getSomeAwesomeBean().getBestStringInTheWorld());

    }

}
