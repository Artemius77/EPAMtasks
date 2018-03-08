package SecondPractise.Models;

import SecondPractise.interfaces.GeneralModel;
import SecondPractise.Models.objects.Patient;

import java.util.Arrays;
import java.util.Comparator;

public class PatientsModel implements GeneralModel {

    private Patient[] array ;
    private Patient[] allPatients ;


    public PatientsModel(Patient[] array) {
        this.array = array;
        allPatients = new Patient[array.length];
        System.arraycopy(array,0,allPatients,0,array.length);
    }

    @Override
    public Patient[] getByDiagnosis(String diagnosis) {
        return  Arrays.stream(allPatients).filter(s -> s.getDiagnosis().equals(diagnosis)).toArray(Patient[]::new);
    }

    @Override
    public Patient[] getByCardNumberRange(int from, int to) {
        return Arrays.stream(allPatients).filter(s -> s.getCardNumber() >= from && s.getCardNumber() <= to).toArray(Patient[]::new);
    }

    @Override
    public Patient[] sortByLastName() {
        return Arrays.stream(allPatients).sorted(Comparator.comparing(Patient::getLastName)).toArray(Patient[]::new);
    }


    @Override
    public Patient[] getAllPatients() {
        return allPatients;
    }

    @Override
    public void setArray(Patient[] array) {
        this.array = array;
    }

    @Override
    public Patient[] getArray() {
        return array;
    }


}
