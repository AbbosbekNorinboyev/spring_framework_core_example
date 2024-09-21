package uz.pdp.springframeworkcore.corejavaconfig;

public class MyBeanOne {
    public void hello() {
        System.out.println("Hello PDP");
        System.out.println("Learn Java Stack in PDP");
    }

    public void init() {
        System.out.println("MyBeanOne init Method");
    }

    public void destroy() {
        System.out.println("MyBeanOne destroy Method");
    }
}
