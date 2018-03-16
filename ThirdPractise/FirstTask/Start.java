package ThirdPractise.FirstTask;

import ThirdPractise.FirstTask.abstracts.MyOwnEnum;
import ThirdPractise.FirstTask.enums.AnotherImpl;
import ThirdPractise.FirstTask.enums.EnumImpl;

import java.util.Arrays;

public class Start {


    public static void main(String[] args)  {

        System.out.println(EnumImpl.TWO);
        System.out.println(EnumImpl.ONE.ordinal());
        System.out.println(Arrays.toString(EnumImpl.values()));
        System.out.println(EnumImpl.valueOf("lol").ordinal());
     //   System.out.println( AnotherImpl.ANOTHER);
    //    System.out.println(Arrays.toString(AnotherImpl.values()));

        for (MyOwnEnum elem: EnumImpl.values()
             ) {
            EnumImpl impl = (EnumImpl)elem;
            System.out.println(impl.getIndex());
        }

        System.out.println(EnumImpl.ONE.compareTo(EnumImpl.TWO));
    }
}
