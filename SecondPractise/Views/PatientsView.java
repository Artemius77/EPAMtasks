package SecondPractise.Views;

import SecondPractise.interfaces.GeneralView;
import SecondPractise.Models.objects.Patient;
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
        System.out.println("|        5. Quit           |");
        System.out.println("============================");
        System.out.println("Select options");
    }

}
