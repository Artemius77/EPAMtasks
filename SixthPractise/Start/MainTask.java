package SecondPractise.SixthPractise.Start;

import SecondPractise.SixthPractise.Controllers.Controller;
import SecondPractise.SixthPractise.Controllers.MainController;
import SecondPractise.SixthPractise.Models.FileUtils.PatientCreatorFromFile;
import SecondPractise.SixthPractise.Models.PatientsCreator;
import SecondPractise.SixthPractise.Models.PatientsModel;
import SecondPractise.SixthPractise.Views.PatientsView;
import SecondPractise.SixthPractise.interfaces.Creator;
import SecondPractise.SixthPractise.interfaces.GeneralModel;
import SecondPractise.SixthPractise.interfaces.GeneralView;

import java.io.IOException;

public class MainTask {


    public static void main(String[] args) throws IOException {

        //Creator patients = new PatientsCreator();
        Creator patients = new PatientCreatorFromFile();
        GeneralModel model = new PatientsModel(patients);
        GeneralView view = new PatientsView();
        Controller controller = new Controller(model,view);
        MainController mainController = new MainController(controller);
        mainController.execute();

    }

//17
    // Menu -> View
}

