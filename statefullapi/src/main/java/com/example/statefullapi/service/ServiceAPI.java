package com.example.statefullapi.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceAPI {

    public String getDetails(){
        return "A stateful API is an API that maintains information (state) about the client across multiple requests. " +
                "This means that the server remembers previous interactions with the client and uses that information to respond appropriately";
    }

}
