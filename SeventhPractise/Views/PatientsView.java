package SecondPractise.SeventhPractise.Views;

import SecondPractise.SeventhPractise.Models.Internationalization.ResourceManager;
import SecondPractise.SeventhPractise.interfaces.GeneralView;
import SecondPractise.SeventhPractise.Models.objects.Patient;
import java.util.Arrays;


public class PatientsView implements GeneralView {

    ResourceManager manager = ResourceManager.INSTANCE;

    @Override
    public void printPatients(Patient[] patients){
        Arrays.stream(patients).forEach(System.out::println);
    }

    public void printMenu(){
        System.out.println(String.format(
                "(\"============================\n" +
                        "        \"|   %s      \n" +
                        "        \"============================\");\n" +
                        "        |        1. %s                \n" +
                        "        |        2. %s                \n" +
                        "        |        3. %s                \n" +
                        "        |        4. %s                \n" +
                        "        |        5. %s                \n" +
                        "        |        6. %s                \n" +
                        "        |        7. %s                \n" +
                        "        |        8. %s                \n" +
                        "        ============================  \n" +
                        "        %s         ",
                manager.getString("menu"),
                manager.getString("diagnosis"),
                manager.getString("sort"),
                manager.getString("printAll"),
                manager.getString("range"),
                manager.getString("putin"),
                manager.getString("getout"),
                manager.getString("change"),
                manager.getString("exit"),
                manager.getString("options")
                ));

    }



}
