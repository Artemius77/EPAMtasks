package FifthPractise.FirstTaskString;

import FifthPractise.FirstTaskString.controller.Controller;
import FifthPractise.FirstTaskString.model.MainModel;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        MainModel model = new MainModel();
        Controller controller = new Controller(model);
        controller.execute();
    }

}
