package com.anujaneja.springTest;

import com.anujaneja.springTest.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPMain {
    public static void main(String...args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);

        System.out.println(shapeService.getCircle().getName());
        System.out.println(shapeService.getTriangle().getName());
    }
}
