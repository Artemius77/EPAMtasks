package SecondPractise.SeventhPractise.Models;

import SecondPractise.SeventhPractise.Models.FileUtils.FileUtil;
import SecondPractise.SeventhPractise.Models.FileUtils.PatientCreatorFromFile;
import SecondPractise.SeventhPractise.interfaces.Creator;
import SecondPractise.SeventhPractise.interfaces.GeneralModel;
import SecondPractise.SeventhPractise.Models.objects.Patient;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class PatientsModel implements GeneralModel {

    private Creator creator;
    private Patient[] array ;
    private Patient[] allPatients ;


    public PatientsModel(Creator creator) throws IOException {
        this.creator = creator;
        this.array = creator.simpleCreate();
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
        return Arrays.stream(allPatients).sorted(Comparator.comparing(Patient::getName)).toArray(Patient[]::new);
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

    @Override
    public void putObjectsInFile() {
        if (creator instanceof PatientCreatorFromFile) {
           FileUtil creator2 = ((PatientCreatorFromFile) creator).getFile();
           creator2.putObjectsInFile(getAllPatients());
        }
        else throw new UnsupportedOperationException("wrong creator");
    }

    @Override
    public Patient[] getObjects() {
        if (creator instanceof PatientCreatorFromFile) {
            FileUtil creator2 = ((PatientCreatorFromFile) creator).getFile();
           return creator2.getObjectsFromFile();
        }
        else throw new UnsupportedOperationException("wrong creator");

    }


}
