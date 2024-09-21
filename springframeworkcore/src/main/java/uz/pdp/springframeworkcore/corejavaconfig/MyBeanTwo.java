package uz.pdp.springframeworkcore.corejavaconfig;

public class MyBeanTwo {
    private final MyBeanOne myBeanOne;

    public MyBeanTwo(MyBeanOne myBeanOne) {
        this.myBeanOne = myBeanOne;
    }

    public void hello() {
        System.out.println("MyBeanTwo");
        myBeanOne.hello();
    }
}
