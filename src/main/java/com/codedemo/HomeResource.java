package com.codedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    Logger LOG = LoggerFactory.getLogger(HomeResource.class);

    @RequestMapping("/")
    public String home(){
            LOG.trace("Trace Logging Home method");
            LOG.debug("Debug Logging Home method");
            LOG.info("Info Logging Home method");
            LOG.warn("Warn Logging Home method");
            LOG.error("Error Logging Home method");
         return "Logging demo Home Method";
    }


}
