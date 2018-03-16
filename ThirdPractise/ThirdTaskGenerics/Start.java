package ThirdPractise.ThirdTaskGenerics;

import ThirdPractise.ThirdTaskGenerics.GeneralClasses.AbstractCarriage;
import ThirdPractise.ThirdTaskGenerics.GeneralClasses.Train;
import ThirdPractise.ThirdTaskGenerics.factories.CarriageFactory;
import ThirdPractise.ThirdTaskGenerics.objects.InterCity;
import ThirdPractise.ThirdTaskGenerics.objects.Kupe;
import ThirdPractise.ThirdTaskGenerics.objects.Plazkart;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {

    public static void main(String[] args) {

        CarriageFactory factory = new CarriageFactory();

        Train<AbstractCarriage> plazkartTrain = new Train<>(new ArrayList<>(Arrays.asList(
                factory.getCarriage("Plazkart",23,55),
                factory.getCarriage("Kupe",213,455),
                factory.getCarriage("Kupe",223,555),
                factory.getCarriage("InterCity",323,575)
        )));

        plazkartTrain.printAll();
        System.out.println("_____________");
        plazkartTrain.sortByComfort();
        plazkartTrain.printAll();

    }
}
