package com.hypertek.configs;

import com.hypertek.beans.PartTimeMentor;
import com.hypertek.stereotype_annotations.Agile;
import com.hypertek.stereotype_annotations.Java;
import com.hypertek.stereotype_annotations.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hypertek.configs",
                basePackageClasses = {com.hypertek.beans.FullTimeMentor.class,
                        PartTimeMentor.class, Agile.class, Java.class, Selenium.class})
public class BeanConfigs {
   @Bean
    public Double printRandomNumber(){
       return Math.floor(Math.random()*100);
    }
}
