package SecondPractise.FirstTask;

import SecondPractise.FirstTask.controller.MainController;
import SecondPractise.FirstTask.model.ModelClass;
import SecondPractise.FirstTask.model.objects.Triangle;
import SecondPractise.FirstTask.view.ShapeView;
import SecondPractise.FirstTask.model.abstracts.Shape;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {

        ModelClass model = new ModelClass();
        ShapeView view = new ShapeView();
        MainController controller = new MainController(view,model);
        controller.execute();

    }
}
