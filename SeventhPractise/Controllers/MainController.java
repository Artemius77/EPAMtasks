package SecondPractise.SeventhPractise.Controllers;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainController {
    private Controller controller;
    final static Logger logger = Logger.getLogger(MainController.class);

    public MainController(Controller controller) {
        this.controller = controller;
    }

    public void execute() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Display menu graphics
       controller.getView().printMenu();


        logger.debug("Main Controller is working!");

        loop:
        while (true) {

            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    System.out.println(controller.getView().INPUT);
                    String diagnosis = reader.readLine();
                    controller.getByDiagnosis(diagnosis);
                    controller.updateView();
                    break;
                case 2:
                    System.out.println(controller.getView().SORTED);
                    controller.sortedByLastName();
                    controller.updateView();
                    break;
                case 3:
                    System.out.println(controller.getView().ALL);
                    controller.getAll();
                    controller.updateView();
                    break;
                case 4:
                    System.out.println(controller.getView().RANGE);
                    System.out.println("From: ");
                    Integer from = Integer.parseInt(reader.readLine());
                    System.out.println("To: ");
                    Integer to = Integer.parseInt(reader.readLine());
                    controller.getByRange(from, to);
                    controller.updateView();
                    break;
                case 5:
                    controller.putObjectsInFile();
                    break;
                case 6:
                    System.out.println(Arrays.toString(controller.getObjectsFromFile()));
                    break;
                case 7:
                    controller.changeLanguage();
                    controller.getView().printMenu();
                    break;
                case 8:
                    System.out.println(controller.getView().EXIT);
                    break loop;
                default:
                    System.out.println(controller.getView().INVALID);
            }
        }
    }
}
