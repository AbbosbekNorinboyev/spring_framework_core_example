package uz.pdp.springframeworkcore.corexmlconfig;

import uz.pdp.springframeworkcore.corejavaconfig.MyBeanOne;

public class Bean2 {
    private final Bean1 bean1;

    public Bean2(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public void hello() {
        System.out.println("Bean2");
        bean1.hello();
    }
}
