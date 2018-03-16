package ThirdPractise.ThirdTaskGenerics.objects;

import ThirdPractise.ThirdTaskGenerics.GeneralClasses.AbstractCarriage;
import ThirdPractise.ThirdTaskGenerics.enums.COMFORT;

public class Kupe  extends AbstractCarriage{

    public Kupe( int passengers, int baggage) {
        super(COMFORT.HIGH, passengers, baggage);
    }

    @Override
    public String toString() {
        return String.format("This is %s carriage, can handle %d passengers, have %d baggage" +
                " with %s comfortLvl", Kupe.class.getSimpleName(), passengers, baggage, comfortLvl);

    }


}
