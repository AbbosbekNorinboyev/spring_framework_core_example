package uz.pdp.springframeworkcore.corejavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainApplicationConfigurations.class);
//        context.register(MyConfigOne.class);
//        context.refresh();
//        MyBeanOne myBeanOne = context.getBean(MyBeanOne.class);
        MyBeanTwo myBeanTwo = context.getBean(MyBeanTwo.class);
        myBeanTwo.hello();

        Person person = context.getBean(Person.class);
        System.out.println("person(java config): " + person);
        context.close();
    }
}
