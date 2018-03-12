package SecondPractise.SecondTask.Controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {
    private Controller controller;

    public MainController(Controller controller) {
        this.controller = controller;
    }

    public void execute() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Display menu graphics
       controller.getView().printMenu();

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
                    System.out.println(controller.getView().EXIT);
                    break loop;
                default:
                    System.out.println(controller.getView().INVALID);
            }
        }
    }
}
