package SecondPractise.FirstTask.model.objects;

import SecondPractise.FirstTask.model.abstracts.Shape;

public class Circle extends Shape {

    private double r;


    public Circle(double r) {
        super("black");
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle, area = " + area + " color = " + shapeColor;
    }

    @Override
    public double calcArea() {
        return area = Math.PI * r * r;
    }
}
