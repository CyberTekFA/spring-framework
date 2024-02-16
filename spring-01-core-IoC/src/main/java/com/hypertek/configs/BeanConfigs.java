package com.hypertek.configs;

import com.hypertek.beans.PartTimeMentor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hypertek.configs",
                basePackageClasses = {com.hypertek.beans.FullTimeMentor.class,
                        PartTimeMentor.class})
public class BeanConfigs {
   @Bean
    public Double printRandomNumber(){
       return Math.floor(Math.random()*100);
    }
}
