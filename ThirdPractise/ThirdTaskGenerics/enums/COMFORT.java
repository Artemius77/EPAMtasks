package ThirdPractise.ThirdTaskGenerics.enums;

public enum COMFORT {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int index ;

     COMFORT(int i) {
        index = i;
    }

    public int getIndex() {
         return index;
    }
}
