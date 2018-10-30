package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
//@RestController
public class Neo4jController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("tefffffffffffst");
        return "fuck";
    }
}
