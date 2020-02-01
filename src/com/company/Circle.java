package com.company;

class Circle {
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

    public boolean isColliding(double cr2, int x2, int y2){
        double distance = Math.sqrt(Math.pow(x-x2, 2));

        if ( distance <= circleRadius + cr2) {
            return true;

            }else {
            return false;

        }

    }



}
