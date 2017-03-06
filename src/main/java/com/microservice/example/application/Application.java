package com.microservice.example.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.microservice.example")
@EntityScan("com.microservice.example.model")
@EnableJpaRepositories("com.microservice.example.repository")
//@EnableCaching
public class Application {


    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }


//    @Bean
//    public Config config() {
//        return new Config().addMapConfig(
//                new MapConfig()
//                        .setName("accepted-messages")
//                        .setEvictionPolicy(EvictionPolicy.LRU)
//                        .setTimeToLiveSeconds(2400));
//    }
}
