package SecondPractise.SixthPractise.interfaces;

import SecondPractise.SixthPractise.Models.objects.Patient;

public interface GeneralModel {


    Patient[] getByDiagnosis(String diagnosis);

    Patient[] getByCardNumberRange(int from, int to);

    Patient[] sortByLastName();

    Patient[] getAllPatients();

    void setArray(Patient[] array);

     Patient[] getArray();

     void putObjectsInFile();

     Patient[] getObjects();

}
