package com.leibangzhu.k8s.provider.service;

import com.leibangzhu.k8s.api.IHelloService;

@com.alibaba.dubbo.config.annotation.Service
public class HelloService implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
