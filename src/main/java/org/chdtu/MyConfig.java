package org.chdtu;

import org.springframework.context.annotation.*;

@ComponentScan("org.chdtu")
@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {


    @Bean
    @Scope("singleton")
    public Library magazineBean(){
        System.out.println("Create bean");
        return new Magazine();
    }

    @Bean
    public Person personBean(){
        return new Person();
    }


    @Bean
    public Magazine magazineBean1(){
        System.out.println("Create bean");
        return new Magazine();
    }
}
