package com.csdncloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableEurekaClient//As long as eureka sever info was configured, this app can be registerd in eureka even without this annotation.REMOVE this annotation when use direct config link
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
//	
	@Value("${foo}")
    String foo;
	
//	@Value("${spring.rabbitmq.port}")
//	String var;
    @RequestMapping(value = "/hi")
    public String hi(){
    	System.out.println("foo----------------"+foo);
        return foo;
//        System.out.println("var----------------"+var);
//        return var;
    }
}
