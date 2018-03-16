package ThirdPractise.FirstTask.enums;

import ThirdPractise.FirstTask.abstracts.MyOwnEnum;

public class AnotherImpl extends MyOwnEnum<AnotherImpl>{

    public static final AnotherImpl ANOTHER = new AnotherImpl("ano");
    public static final AnotherImpl ONEMORe = new AnotherImpl("sec");

    public AnotherImpl(String name) {
        super(name);
    }

}
