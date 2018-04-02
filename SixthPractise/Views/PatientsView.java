package SecondPractise.SixthPractise.Views;

import SecondPractise.SixthPractise.interfaces.GeneralView;
import SecondPractise.SixthPractise.Models.objects.Patient;
import java.util.Arrays;


public class PatientsView implements GeneralView {

    @Override
    public void printPatients(Patient[] patients){
        Arrays.stream(patients).forEach(System.out::println);
    }

    public void printMenu(){
        System.out.println("============================");
        System.out.println("|   MENU SELECTION DEMO    |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. Diagnosis      |");
        System.out.println("|        2. Sort           |");
        System.out.println("|        3. Print ALL      |");
        System.out.println("|        4. Range          |");
        System.out.println("|        5. Put In         |");
        System.out.println("|        6. Get Out        |");
        System.out.println("|        7. Quit           |");
        System.out.println("============================");
        System.out.println("Select options");
    }

}
