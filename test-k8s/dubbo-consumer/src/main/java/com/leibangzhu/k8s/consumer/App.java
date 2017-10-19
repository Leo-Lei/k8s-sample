package com.leibangzhu.k8s.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private SomeComponent component;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name) {
        return component.hello(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
