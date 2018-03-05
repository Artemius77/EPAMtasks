package SecondPractise.interfaces;

import SecondPractise.objects.Patient;

public interface GeneralModel {


    Patient[] getByDiagnosis(String diagnosis);

    Patient[] getByCardNumberRange(int from, int to);

    Patient[] sortByLastName();

    Patient[] getAllPatients();

    void setArray(Patient[] array);

     Patient[] getArray();

}
