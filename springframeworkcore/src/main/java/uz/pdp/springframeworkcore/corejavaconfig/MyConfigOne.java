package uz.pdp.springframeworkcore.corejavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigOne {
    @Bean(name = "myBeanOne", initMethod = "init", destroyMethod = "destroy")
    public MyBeanOne myBeanOne() {
        return new MyBeanOne();
    }

//    @Bean
//    public MyBeanTwo myBeanTwo(MyBeanOne myBeanOne) {
//        return new MyBeanTwo(myBeanOne);
//    }
}
