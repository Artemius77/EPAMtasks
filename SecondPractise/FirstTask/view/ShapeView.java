package SecondPractise.FirstTask.view;

import SecondPractise.FirstTask.model.abstracts.Shape;

public class ShapeView {

    public void printShapes(Shape[] shapes) {
        for (Shape shape: shapes
             ) {
            System.out.println("Current shape: " + shape);
        }
    }

    public void printResults(double d) {
        System.out.println(d);
    }

    public void printMenu(){
        System.out.println("============================");
        System.out.println("|   MENU SELECTION DEMO    |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. All area       |");
        System.out.println("|        2. Spec area      |");
        System.out.println("|        3. Print ALL      |");
        System.out.println("|        4. Color Sort     |");
        System.out.println("|        5. Area Sort      |");
        System.out.println("|        6. Quit           |");
        System.out.println("============================");
        System.out.println("Select options");
    }

}
