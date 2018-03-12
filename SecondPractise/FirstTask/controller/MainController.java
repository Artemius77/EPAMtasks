package SecondPractise.FirstTask.controller;

import SecondPractise.FirstTask.model.ModelClass;
import SecondPractise.FirstTask.view.ShapeView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController extends  Controller {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public MainController(ShapeView view, ModelClass model) {
        super(view, model);
    }

    public void execute() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Display menu graphics
        getView().printMenu();

        loop:
        while (true) {

            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    getView().printResults(sumArea());
                    break;
                case 2:
                    String input = reader.readLine();
                    getView().printResults(sumArea(input));
                    break;
                case 3:
                    getView().printShapes(getAll());
                    break;
                case 4:
                    getView().printShapes(sortByColor());
                    break;
                case 5:
                    getView().printShapes(sortByArea());
                    break;
                case 6:
                    break loop;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
    }


