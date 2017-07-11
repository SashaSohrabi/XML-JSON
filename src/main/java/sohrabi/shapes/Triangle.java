package Geometry;

public class Triangle extends Shape {

    private double edgeA;
    private double edgeB;
    private double edgeC;
    private double area;
    private double perimeter;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        //SquareRoot
        double s = (edgeA + edgeB + edgeC) / 2;
        area = Math.sqrt(s * (s - edgeA) * (s - edgeB) * (s - edgeC));
        perimeter = edgeA + edgeB + edgeC;

    }
}