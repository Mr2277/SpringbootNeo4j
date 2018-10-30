package com.example.neo4j.entity;

import lombok.Data;



@Data
public class Stock {

    private Long nodeId;
    private String stockId;

    private String name;

}
