package com.service.mnbk.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-29T03:59:46.815Z")

@RestSchema(schemaId = "mnbk")
@RequestMapping(path = "/mnbk", produces = MediaType.APPLICATION_JSON)
public class MnbkImpl {

    @Autowired
    private MnbkDelegate userMnbkDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMnbkDelegate.helloworld(name);
    }

}
