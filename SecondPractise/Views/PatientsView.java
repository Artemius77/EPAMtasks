package SecondPractise.Views;

import SecondPractise.interfaces.GeneralView;
import SecondPractise.objects.Patient;
import java.util.Arrays;


public class PatientsView implements GeneralView {

    @Override
    public void printPatients(Patient[] patients){
        Arrays.stream(patients).forEach(System.out::println);
    }

}
