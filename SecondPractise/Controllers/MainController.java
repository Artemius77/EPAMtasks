package SecondPractise.Controllers;

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
        System.out.println("============================");
        System.out.println("|   MENU SELECTION DEMO    |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. Diagnosis      |");
        System.out.println("|        2. Sort           |");
        System.out.println("|        3. Print ALL      |");
        System.out.println("|        4. Range          |");
        System.out.println("|        5. Quit           |");
        System.out.println("============================");
        System.out.println("Select options");

        loop:
        while (true) {

            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    System.out.println("Input diagnosis");
                    String diagnosis = reader.readLine();
                    controller.getByDiagnosis(diagnosis);
                    controller.updateView();
                    break;
                case 2:
                    System.out.println("Patients sorted by alphabet");
                    controller.sortedByLastName();
                    controller.updateView();
                    break;
                case 3:
                    System.out.println("All patients");
                    controller.getAll();
                    controller.updateView();
                    break;
                case 4:
                    System.out.println("Choose patients range:");
                    System.out.println("From: ");
                    Integer from = Integer.parseInt(reader.readLine());
                    System.out.println("To: ");
                    Integer to = Integer.parseInt(reader.readLine());
                    controller.getByRange(from, to);
                    controller.updateView();
                    break;
                case 5:
                    System.out.println("Exit selected");
                    break loop;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
