package com.example.neo4j.controller;

import com.example.neo4j.Service.Neo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RestController
public class Neo4jController {
    @Autowired
    private Neo4jService neo4jService;
    @RequestMapping("/test")
    public String test(){
        System.out.println("tefffffffffffst");
        neo4jService.test();
        neo4jService.test1();
        return "fuck";
    }
}
