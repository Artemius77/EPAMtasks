package SecondPractise.Start;

import SecondPractise.Controllers.Controller;
import SecondPractise.Controllers.MainController;
import SecondPractise.Models.PatientsCreator;
import SecondPractise.Models.PatientsModel;
import SecondPractise.Views.PatientsView;
import SecondPractise.interfaces.Creator;
import SecondPractise.interfaces.GeneralModel;
import SecondPractise.interfaces.GeneralView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

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

