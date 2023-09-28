package com.csc205.project2;

/*

Generate a cone class with the methods calculateVolume and calculateSurfaceArea

you got the formula wrong for the cone volume can you redo it (I said to chatGPT after it got
it wrong...)
 */

class Cone extends GeometricShape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        super("Cone");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 5.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {
        return name + " {" +
                "radius=" + radius +
                ", height=" + height +
                ", volume=" + calculateVolume() +
                ", surface area=" + calculateSurfaceArea() +
                '}';
    }
}