package Projects.Project1OOP;

import Projects.Project1OOP.controller.MainController;
import Projects.Project1OOP.model.GeneralModel;
import Projects.Project1OOP.view.MainView;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        GeneralModel model = new GeneralModel();
        MainView view = new MainView();
        MainController controller = new MainController(view,model);
        controller.execute();
    }
}
