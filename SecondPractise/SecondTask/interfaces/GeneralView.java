package SecondPractise.SecondTask.interfaces;

import SecondPractise.SecondTask.Models.objects.Patient;

public interface GeneralView {
    String INPUT = "Input diagnosis";
    String SORTED = "Patients sorted by alphabet";
    String ALL = "All patients";
    String RANGE =  "Choose patients range:";
    String EXIT = "Exit selected";
    String INVALID = "Invalid selection";

    void printPatients(Patient[] patients);

    void printMenu();
}
