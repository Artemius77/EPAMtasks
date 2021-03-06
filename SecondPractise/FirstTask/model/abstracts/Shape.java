package SecondPractise.FirstTask.model.abstracts;

import SecondPractise.FirstTask.model.interfaces.Drawable;

public abstract  class Shape implements Drawable{
    protected String shapeColor;
    protected double area;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public abstract String toString();

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }
}
