package uz.pdp.springframeworkcore.corexmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        Bean1 bean1 = (Bean1) context.getBean("bean1");
//        Bean2 bean2 = (Bean2) context.getBean("bean2");
        Bean2 bean2 = context.getBean(Bean2.class);
        bean2.hello();
    }
}
