package SecondPractise.FirstTask.model.objects;

import SecondPractise.FirstTask.model.abstracts.Shape;

public class Triangle extends Shape {
    private double a,h;


    public Triangle(double a, double h) {
        super("yellow");
        this.a = a;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Triangle, area = " + area + " color = " + shapeColor;
    }

    @Override
    public double calcArea() {
        return area = 0.5 * a * h;
    }
}
