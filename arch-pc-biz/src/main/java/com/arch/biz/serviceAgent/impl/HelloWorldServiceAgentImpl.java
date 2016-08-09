package com.arch.biz.serviceAgent.impl;


import com.arch.biz.serviceAgent.HelloWorldServiceAgent;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

/**
 * Created by chenxiaobian on 16/7/13.
 */

@Component
@Log4j
public class HelloWorldServiceAgentImpl implements HelloWorldServiceAgent{

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
