package com.junitTesting.SecondTask;


import com.junitTesting.SecondTask.abstracts.Shape;
import com.junitTesting.SecondTask.objects.*;

public class ShapeCreator {

    public static Shape[] createShapes(){
        return new Shape[] {
                new Triangle(4,5),
                new Triangle(2,3),
                new Rectangle(6,7),
                new Rectangle(4,5),
                new Circle(3),
                new Circle(6),
                new Triangle(1,1),
                new Circle(2),
                new Rectangle(2,1),
                new Triangle(1,7)
        };
    }

}
