package ThirdPractise.ThirdTaskGenerics.objects;

import ThirdPractise.ThirdTaskGenerics.GeneralClasses.AbstractCarriage;
import ThirdPractise.ThirdTaskGenerics.enums.COMFORT;

public class Plazkart extends AbstractCarriage {

    public Plazkart(int passengers, int baggage) {
        super(COMFORT.LOW, passengers, baggage);
    }

    @Override
    public String toString() {
        return String.format("This is %s carriage, can handle %d passengers, have %d baggage" +
                " with %s comfortLvl",Plazkart.class.getSimpleName(), passengers, baggage, comfortLvl);

    }


}
