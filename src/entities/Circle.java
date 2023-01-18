package entities;

import entities.enums.Color;

public class Circle extends Shape{

    private Double radius;

    private Circle(){
        super();
    }



    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    

    @Override
    public Double area() {

        return Math.PI * Math.pow(radius, 2);
    }





}
