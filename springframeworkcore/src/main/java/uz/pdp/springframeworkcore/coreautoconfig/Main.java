package uz.pdp.springframeworkcore.coreautoconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.springframeworkcore.coreautoconfig.config.MyConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean2 myBean2 = context.getBean(MyBean2.class);
        myBean2.hi();
        HomeController homeController = context.getBean(HomeController.class);
        System.out.println("homeController: " + homeController);
        context.close();

    }
}