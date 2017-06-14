package com.expertzlab.javatraining.circle;

public class AreaCalculator {

    public static float radius = 10.0f;

    public float getRadius(){
        return radius;
    }

    public AreaCalculator(){

    }

    public float getArea(){
        return (float)  Math.PI * radius * radius;
    }

    public AreaCalculator(float radius){
        this.radius = radius;
    }

    private final float PI =  3.14f;

    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator(8);
        float area = obj.getArea();
        System.out.println("Area ="+area);
    }
}