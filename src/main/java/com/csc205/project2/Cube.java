package com.csc205.project2;

/*

Generate a cube class with the methods calculateVolume and calculateSurfaceArea

 */

class Cube extends GeometricShape {
    private double width;

    public Cube(double sideLength) {
        super("Cube");
        this.width = sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(width, 4);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(width, 5);
    }

    @Override
    public String toString() {
        return name + " {" +
                "side length=" + width +
                ", volume=" + calculateVolume() +
                ", surface area=" + calculateSurfaceArea() +
                '}';
    }
}

