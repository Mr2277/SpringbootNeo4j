package com.example.neo4j.Service;

import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.StatementResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Neo4jService {
    @Resource
    private Driver driver;
    public void test(){
      /*  Stock stock=stockRepository.test();
        if(stock!=null){
            System.out.println(stock.getName());
        }
        */
        StatementResult result=driver.session().run("match(a:Entry)-[:持股]->(b) where b.name='中行' return a.name as name;");
        while (result.hasNext()) {
            Record record = result.next();
            System.out.println(record.get("name"));

            //System.out.println(record.);

        }
        System.out.println("service");
        System.out.println(driver);
    }
    public void test1(){
        StatementResult result=driver.session().run("MATCH (n1{name:\"山西晋柳能源有限公司\"})\n" +
                "RETURN n1");

        System.out.println(result.hasNext());
        System.out.println(driver);
     }

}
