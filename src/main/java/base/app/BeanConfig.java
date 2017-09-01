package base.app;

import base.annotations.Bean;
import base.annotations.BeanConfiguration;
import base.app.beans.NotSoAwesomeBean;
import base.app.beans.SomeAwesomeBean;

@BeanConfiguration
public class BeanConfig {

    @Bean
    public SomeAwesomeBean someAwesomeBean() {
        SomeAwesomeBean someAwesomeBean = new SomeAwesomeBean();
        someAwesomeBean.setBestStringInTheWorld("the best of the best");
        return someAwesomeBean;
    }

    @Bean
    public NotSoAwesomeBean notSoAwesomeBean() {
        NotSoAwesomeBean notSoAwesomeBean = new NotSoAwesomeBean();
        notSoAwesomeBean.setWowSoMuchInt(122);
        return notSoAwesomeBean;
    }

}
