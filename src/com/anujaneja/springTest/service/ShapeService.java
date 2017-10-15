package com.anujaneja.springTest.service;

import com.anujaneja.springTest.model.Circle;
import com.anujaneja.springTest.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by anuj on 11/10/17.
 */
@Component
public class ShapeService {

    @Autowired
    private Triangle triangle;
    @Autowired
    private Circle circle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

}
