package com.example.task2.controller;

import com.example.task2.service.StatefullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatefullController {

    @Autowired
    StatefullService sta;

    @GetMapping("/statefullApiDetails")
    public String getDetails(){
        return sta.getDetails();
    }
}
