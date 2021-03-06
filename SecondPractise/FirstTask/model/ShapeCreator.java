package SecondPractise.FirstTask.model;

import SecondPractise.FirstTask.model.abstracts.Shape;
import SecondPractise.FirstTask.model.objects.Circle;
import SecondPractise.FirstTask.model.objects.Rectangle;
import SecondPractise.FirstTask.model.objects.Triangle;


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
