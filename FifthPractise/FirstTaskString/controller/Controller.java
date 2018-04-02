package FifthPractise.FirstTaskString.controller;

import FifthPractise.FirstTaskString.model.MainModel;
import FifthPractise.FirstTaskString.model.ValidationUtils.validators.TypeValidators;
import FifthPractise.FirstTaskString.model.entities.RecordClass;
import FifthPractise.FirstTaskString.model.utils.ConsoleHelper;

import java.io.IOException;


public class Controller {

    private MainModel model;


    public Controller(MainModel model) {
        this.model = model;
    }

    public void execute() throws IOException {

        /*RecordClass recordClass = new RecordClass();
        recordClass.setName("Josh");
        recordClass.setBirthday("01.05.2000");
        recordClass.setLastName("Lindce");
        recordClass.setLocation("Hill st. 34");
        recordClass.setNumber("(342) 342 2222");

        RecordClass recordClass2 = new RecordClass();
        recordClass2.setName("Art34-tre#");
        recordClass2.setBirthday("01-023-2000");
        recordClass2.setLastName("Asdfe");
        recordClass2.setLocation("Hill st. we 34");
        recordClass2.setNumber("(38) 3492 2222");

        RecordClass recordClass3 = new RecordClass();
        recordClass3.setName("sosh--");
        recordClass3.setBirthday("01052000");
        recordClass3.setLastName("Drake");
        recordClass3.setLocation("Hill stert 34 43");
        recordClass3.setNumber("342-342-2222");

        RecordClass recordClass5 = new RecordClass();
        recordClass5.setName("Arete dfg");
        recordClass5.setBirthday("11-03.1999");
        recordClass5.setLastName("234Fs");
        recordClass5.setLocation("Hil street 34");
        recordClass5.setNumber("(342)-342-2222");

        List<RecordClass> list = new ArrayList<>(Arrays.asList(recordClass,
                recordClass2, recordClass3, recordClass5));

        for (RecordClass record: list
             ) {
            System.out.println(record.getName() + " " + "list of problems: \n" +
                    model.getAllValidations().multipleCheck(record));
            System.out.println("____________________");
        }*/

        TypeValidators validators = null;
        RecordClass recordClass = null;

        while (validators != TypeValidators.SUCCEED) {
            System.out.println("input name");
            String name= ConsoleHelper.readString();
            System.out.println("input lastName");
            String lastName = ConsoleHelper.readString();
            System.out.println("input birth");
            String birth = ConsoleHelper.readString();
            System.out.println("input number");
            String number = ConsoleHelper.readString();
            System.out.println("input location");
            String location = ConsoleHelper.readString();

            recordClass = new RecordClass(name,lastName,birth,number,location);
            validators = model.getAllValidations().singleCheck(recordClass);

            System.out.println("Current list of problems: " +
                        model.getAllValidations().multipleCheck(recordClass));
        }

        System.out.println("this is valid record" + recordClass);

    }
}
