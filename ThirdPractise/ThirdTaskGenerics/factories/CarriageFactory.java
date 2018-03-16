package ThirdPractise.ThirdTaskGenerics.factories;

import ThirdPractise.ThirdTaskGenerics.GeneralClasses.AbstractCarriage;
import ThirdPractise.ThirdTaskGenerics.objects.InterCity;
import ThirdPractise.ThirdTaskGenerics.objects.Kupe;
import ThirdPractise.ThirdTaskGenerics.objects.Plazkart;

public class CarriageFactory {

    public AbstractCarriage getCarriage(String name, int passenger, int baggage) {

        if (name.length() == 0) return null;

        if (name.equalsIgnoreCase("plazkart"))
            return new Plazkart(passenger,baggage);
        else if (name.equalsIgnoreCase("kupe"))
            return new Kupe(passenger,baggage);
        else if (name.equalsIgnoreCase("intercity"))
            return new InterCity(passenger,baggage);

        throw new IllegalArgumentException("wrong name " + name);
    }
}
