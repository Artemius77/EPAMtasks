package SecondPractise.SecondTask.Models;

import SecondPractise.SecondTask.interfaces.Creator;
import SecondPractise.SecondTask.Models.objects.Patient;

public class PatientsCreator implements Creator{



    @Override
    public Patient[] simpleCreate() {
        Patient[] array =  new Patient[5];
        array[0] = new Patient("Abigaile","Swan","Car",
                "Backstreet-22","8055394",345,"cancer");
        array[1] =  new Patient("Josh","Bak","Dul",
                "Ilicha-17","4345345",7,"flu");
        array[2] = new Patient("Jessica","Swan","Car",
                "Backstreet-22","34522",100,"cancer");
        array[3] = new Patient("Mike","Hogger","Jek",
                "Suvorova-7","4352",55,"diarrhea");
        array[4] = new Patient("Drake","Jonson","Hel",
                "Shulyavka22f","13467",222,"unknown");
        return array;
    }


}
