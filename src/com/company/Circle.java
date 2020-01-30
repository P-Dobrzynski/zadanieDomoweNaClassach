package com.company;

public class Circle {
    private int x, y;
    private double circleRadius;

    public Circle(double circleRadius, int x, int y) {
       this.circleRadius=circleRadius;
       this.x = x;
       this.y = y;
    }

    public void calculateArea() {
        double area = Math.PI * ( circleRadius * circleRadius);
        System.out.println("Pole koła wynosi: " + area);
    }

    public double calculateCircumference () {
       double circumference = 2 * Math.PI * circleRadius;

        return circumference;

    }

    public void isColliding(double cr2, int x2, int y2){
        boolean collision = true;
        double distance = Math.sqrt((x - x2)*(x - x2))+((y-y2)*(y - y2));

        if ( distance < circleRadius + cr2) {
         collision = true;
            System.out.println("circles have collided");
            }else {
            collision = false;
            System.out.println("circles have not collided");
        }

    }



}
