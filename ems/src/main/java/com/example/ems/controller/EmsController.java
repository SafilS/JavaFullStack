package com.example.ems.controller;

import com.example.ems.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmsController {

    @Autowired
    EmsService emsService;

}
