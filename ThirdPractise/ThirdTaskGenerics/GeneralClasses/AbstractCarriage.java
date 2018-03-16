package ThirdPractise.ThirdTaskGenerics.GeneralClasses;

import ThirdPractise.ThirdTaskGenerics.enums.COMFORT;

public abstract  class AbstractCarriage {

    protected COMFORT comfortLvl;
    protected int passengers;
    protected int baggage;


    public AbstractCarriage(COMFORT comfortLvl, int passengers, int baggage) {
        this.comfortLvl = comfortLvl;
        this.passengers = passengers;
        this.baggage = baggage;
    }

    public COMFORT getComfortLvl() {
        return comfortLvl;
    }

    public void setComfortLvl(COMFORT comfortLvl) {
        this.comfortLvl = comfortLvl;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public abstract String toString();



}
