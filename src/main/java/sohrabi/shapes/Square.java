package Geometry;

/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Square extends Shape {

    private double edge;
    private double area;
    private double perimeter;
    public Square(double edge) {
        this.edge = edge;
        this.area = Math.pow(edge, 2);
        this.perimeter = 4 * edge; 
    }
}

