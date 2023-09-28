package com.csc205.project2;

abstract class GeometricShape implements ThreeDimensionalShape {
    protected String name;

    public GeometricShape(String name) {
        this.name = name;
    }
}