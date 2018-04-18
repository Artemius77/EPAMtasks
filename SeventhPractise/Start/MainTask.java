package SecondPractise.SeventhPractise.Start;

import SecondPractise.SeventhPractise.Controllers.Controller;
import SecondPractise.SeventhPractise.Controllers.MainController;
import SecondPractise.SeventhPractise.Models.FileUtils.PatientCreatorFromFile;
import SecondPractise.SeventhPractise.Models.PatientsModel;
import SecondPractise.SeventhPractise.Views.PatientsView;
import SecondPractise.SeventhPractise.interfaces.Creator;
import SecondPractise.SeventhPractise.interfaces.GeneralModel;
import SecondPractise.SeventhPractise.interfaces.GeneralView;

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

