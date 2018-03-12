package SecondPractise.SecondTask.Start;

import SecondPractise.SecondTask.Controllers.Controller;
import SecondPractise.SecondTask.Controllers.MainController;
import SecondPractise.SecondTask.Models.PatientsCreator;
import SecondPractise.SecondTask.Models.PatientsModel;
import SecondPractise.SecondTask.Views.PatientsView;
import SecondPractise.SecondTask.interfaces.Creator;
import SecondPractise.SecondTask.interfaces.GeneralModel;
import SecondPractise.SecondTask.interfaces.GeneralView;

import java.io.IOException;

public class MainTask {


    public static void main(String[] args) throws IOException {

        Creator patients = new PatientsCreator();
        GeneralModel model = new PatientsModel(patients.simpleCreate());
        GeneralView view = new PatientsView();
        Controller controller = new Controller(model,view);
        MainController mainController = new MainController(controller);

    }

//17
    // Menu -> View
}

