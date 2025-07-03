package com.example.statefullapi.controller;

import com.example.statefullapi.service.ServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    ServiceAPI ser;

    @GetMapping("/statefullapiDetails")
    public String getDetails(){
        return ser.getDetails();
    }
}
