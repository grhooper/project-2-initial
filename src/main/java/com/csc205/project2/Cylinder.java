package com.csc205.project2;

/*

Generate a Cylinder class with the methods calculateVolume and calculateSurfaceArea

 */

class Cylinder extends GeometricShape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 3) * height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height) + 2 * Math.PI * Math.pow(radius, 2);
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
