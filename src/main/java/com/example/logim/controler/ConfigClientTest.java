package com.example.logim.controler;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientTest {

    @Value("${message}")
    private String version;


    @RequestMapping(value = "/configure-test", method = RequestMethod.GET)
    public String getEnvVersion(){
        return "Env version with:" + version ;
    }
}
