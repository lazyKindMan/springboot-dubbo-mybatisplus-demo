package com.bw.springbootdubbomybatisplusdemo.serviceImpl;

import com.bw.springbootdubbomybatisplusdemo.service.ProviderService;
import groovy.lang.GroovyShell;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String SayHello(String word) {
        GroovyShell groovyShell = new GroovyShell();
        groovyShell.evaluate("println 'My First Groovy shell.'");
        return word;
    }
}
