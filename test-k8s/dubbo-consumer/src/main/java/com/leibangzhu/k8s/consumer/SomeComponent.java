package com.leibangzhu.k8s.consumer;

import com.leibangzhu.k8s.api.IHelloService;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    @com.alibaba.dubbo.config.annotation.Reference
    private IHelloService helloService;

    public String hello(String name){
        return helloService.sayHello(name);
    }
}
