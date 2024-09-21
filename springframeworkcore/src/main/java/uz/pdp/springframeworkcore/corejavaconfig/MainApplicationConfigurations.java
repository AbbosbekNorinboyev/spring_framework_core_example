package uz.pdp.springframeworkcore.corejavaconfig;

import org.springframework.context.annotation.*;

@Configuration
@Import({MyConfigOne.class, MyConfigTwo.class})
@ImportResource("classpath:ioc-settings2.xml")
@PropertySource("classpath:application2.properties")
public class MainApplicationConfigurations {
    @Bean(initMethod = "initSomeData")
    @Conditional(DBInitCondition.class)
    public DBInit dbInit() {
        return new DBInit();
    }
}
