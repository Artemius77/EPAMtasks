package com.junitTesting.SecondTask;


import com.junitTesting.SecondTask.abstracts.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ModelClass {

    private Shape[] shapes = ShapeCreator.createShapes();

    public ModelClass() {
    }

    public  double sumArea() {
        return Arrays.stream(shapes).mapToDouble(Shape::calcArea).sum();
    }

    public  double sumArea(String shape) {
        return Arrays.stream(shapes).filter(s -> s.getClass().getSimpleName().equals(shape)).
                mapToDouble(Shape::calcArea).sum();
        /*double sum = 0;
        for (Shape sh: shapes
             ) {
            System.out.println(sh.getClass().getSimpleName());
            System.out.println(shape);
            if (sh.getClass().getSimpleName().equals(shape)) {
                System.out.println(sum);
                sum += sh.calcArea();
            }
        }
        return sum;*/
    }

    public  Shape[] sortByArea() {
        return Arrays.stream(shapes).sorted(Comparator.comparing(Shape::calcArea)).toArray(Shape[]::new);
    }

    public  Shape[] sortByColor() {
        return Arrays.stream(shapes).sorted(Comparator.comparing(Shape::getShapeColor)).toArray(Shape[]::new);
    }

    public  Shape[] getAll() {
        return shapes;
    }

}
//(o1, o2) -> (int)(o1.calcArea() - o2.calcArea())