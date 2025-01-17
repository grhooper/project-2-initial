package com.csc205.project2;

/*
Generate a sphere class with the methods calculateVolume and calculateSurfaceArea
 */

class Sphere extends GeometricShape {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return name + " {" +
                "radius=" + radius +
                ", volume=" + calculateVolume() +
                ", surface area=" + calculateSurfaceArea() +
                '}';
    }
}
