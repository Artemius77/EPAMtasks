package ThirdPractise.FirstTask.enums;

import ThirdPractise.FirstTask.abstracts.MyOwnEnum;

public class EnumImpl extends MyOwnEnum<EnumImpl> {

    public static final EnumImpl ONE = new EnumImpl("one");
    public static final EnumImpl TWO = new EnumImpl("lol");
    public static final EnumImpl THREE = new EnumImpl("three");

    public int index = 5;

    private EnumImpl(String name) {
        super(name);
    }

    public int getIndex() {
        return index;
    }

}
