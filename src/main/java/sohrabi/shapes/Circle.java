package Geometry;

/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape{
    private double radius;
    private double area;
    private double perimeter;
    
    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.pow(radius, 2) * Math.PI;
        this.perimeter = 2 * Math.PI * radius; 
    }

}
