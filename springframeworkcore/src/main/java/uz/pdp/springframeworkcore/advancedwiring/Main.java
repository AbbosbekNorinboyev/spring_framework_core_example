package uz.pdp.springframeworkcore.advancedwiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc-settings.xml");
        Person personBean = context.getBean(Person.class);
        System.out.println("personBean: " + personBean);
        System.out.println("Some job");
        BaseDAO baseDAO = context.getBean(BaseDAO.class);
        System.out.println("baseDAO: " + baseDAO);

        Service service = context.getBean("roleService", Service.class);
        System.out.println("service: " + service);
        context.close();
    }
}
