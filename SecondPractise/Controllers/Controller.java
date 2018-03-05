package SecondPractise.Controllers;


import SecondPractise.interfaces.*;


public class Controller {

    private GeneralModel model;
    private GeneralView view;

    public Controller(GeneralModel model, GeneralView view) {
        this.model = model;
        this.view = view;
    }


    public void getByDiagnosis(String diagnosis){
        model.setArray(model.getByDiagnosis(diagnosis));
    }

    public void getByRange(int from, int to){
        model.setArray(model.getByCardNumberRange(from,to));
    }

    public void sortedByLastName(){
        model.setArray(model.sortByLastName());
    }


    public void getAll(){
        model.setArray(model.getAllPatients());
    }

    public void updateView(){
        view.printPatients(model.getArray());
    }

}
