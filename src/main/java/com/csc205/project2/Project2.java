package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(3.0);
        Cube cube = new Cube(4.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(5.0, 6.0);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        for (ThreeDimensionalShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
