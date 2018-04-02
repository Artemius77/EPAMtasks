package Projects.Project1OOP.controller;

import Projects.Project1OOP.model.GeneralModel;
import Projects.Project1OOP.view.MainView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController  extends Controller{

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public MainController(MainView view, GeneralModel model) {
        super(view, model);
    }

    public void execute() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Display menu graphics
        view.printMenu();

        loop:
        while (true) {

            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    view.printList(model.getAll());
                    break;
                case 2:
                    view.printList(model.getAllDep());
                    break;
                case 3:
                    view.printList(model.sortByProfit());
                    break;
                case 4:
                    view.printInput();
                    int rate = Integer.parseInt(reader.readLine());
                    view.printDeposit(model.searchByRate(rate));
                    break;
                case 5:
                    break loop;
                default:
                    System.out.println("Invalid input!");

            }
        }
    }

}
