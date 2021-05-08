package com.bw.springbootdubbomybatisplusdemo;

import com.bw.springbootdubbomybatisplusdemo.service.ProviderService;
import com.bw.springbootdubbomybatisplusdemo.serviceImpl.ProviderServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import

org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
@SpringBootApplication
public class SpringbootDubboMybatisplusDemoApplication {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//        context.start();
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        SpringApplication.run(SpringbootDubboMybatisplusDemoApplication.class);
        ProviderService providerService = new ProviderServiceImpl();
        providerService.SayHello("hello");
    }

}
