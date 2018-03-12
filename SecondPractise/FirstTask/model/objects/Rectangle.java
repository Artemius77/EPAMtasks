package SecondPractise.FirstTask.model.objects;

import SecondPractise.FirstTask.model.abstracts.Shape;

public class Rectangle extends Shape {
    private double a, b;

    @Override
    public String toString() {
        return  "Rectangle, area = " + area + " color = " + shapeColor;
    }

    public Rectangle(double a, double b){
        super("red");
        this.a = a;
        this.b = b;
    };


    @Override
    public double calcArea() {
        return area = a*b;
    }
}
