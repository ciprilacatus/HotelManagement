package com.HotelManagement.HotelManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {
    @GetMapping("/")
    public String index() {
        return "Hotel Management Solutions";
    }
}
