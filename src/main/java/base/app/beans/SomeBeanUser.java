package base.app.beans;


import base.annotations.Autowire;

public class SomeBeanUser {

    @Autowire
    private SomeAwesomeBean someAwesomeBean;
    @Autowire
    private NotSoAwesomeBean notSoAwesomeBean;

    public SomeAwesomeBean getSomeAwesomeBean() {
        return someAwesomeBean;
    }

    public void setSomeAwesomeBean(SomeAwesomeBean someAwesomeBean) {
        this.someAwesomeBean = someAwesomeBean;
    }

    public NotSoAwesomeBean getNotSoAwesomeBean() {
        return notSoAwesomeBean;
    }

    public void setNotSoAwesomeBean(NotSoAwesomeBean notSoAwesomeBean) {
        this.notSoAwesomeBean = notSoAwesomeBean;
    }
}
