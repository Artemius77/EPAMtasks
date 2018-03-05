package SecondPractise.Start;

import SecondPractise.Controllers.Controller;
import SecondPractise.Models.PatientsCreator;
import SecondPractise.Models.PatientsModel;
import SecondPractise.Views.PatientsView;
import SecondPractise.interfaces.Creator;
import SecondPractise.interfaces.GeneralModel;
import SecondPractise.interfaces.GeneralView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask {


    public static void main(String[] args) throws IOException {

        Creator patients = new PatientsCreator();
        GeneralModel model = new PatientsModel(patients.simpleCreate());
        GeneralView view = new PatientsView();

        Controller controller = new Controller(model,view);

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


/*
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

loop: while (true) {

    switch (Integer.parseInt(reader.readLine())) {
        case 1:
            System.out.println("Input diagnosis");
            String diagnosis = reader.readLine();
            runner.getByDiagnosis(diagnosis);
            break;
        case 2:
            System.out.println("Patients sorted by alphabet");
            runner.sortedByLastName();
            break;
        case 3:
            System.out.println("All patients");
             runner.printArray();
        case 4:
            System.out.println("Choose patients range:");
            System.out.println("From: ");
            Integer from = Integer.parseInt(reader.readLine());
            System.out.println("To: ");
            Integer to = Integer.parseInt(reader.readLine());
            runner.getByRange(from,to);
            break;
        case 5:
            System.out.println("Exit selected");
            break loop;
        default:
            System.out.println("Invalid selection");
    }
}
 *Boolean rofl = new BOOLEAN("TrUe");
/*fghfhfghf*/
/*
//default behavior
        Controller runner = new Controller();

        runner.printArray();
        System.out.println("get by diagnosis______");
        runner.getByDiagnosis("cancer");
        System.out.println("get by range____");
        runner.getByRange(1,111);
        System.out.println("sort by lastName___");
        runner.sortedByLastName();
 */
