package Projects.Project1OOP.controller;

import Projects.Project1OOP.model.GeneralModel;
import Projects.Project1OOP.model.objects.Banks.Bank;
import Projects.Project1OOP.model.objects.Deposits.Deposit;
import Projects.Project1OOP.view.MainView;

import java.util.List;

public class Controller {

    protected MainView view;
    protected GeneralModel model;

    public Controller(MainView view, GeneralModel model) {
        this.view = view;
        this.model = model;
    }

    public List<Deposit> sortByProfit() {
        return model.sortByProfit();
    }

    public Deposit searchByRate(int rate) {
        return model.searchByRate(rate);
    }

    public  List<Bank> getAll() {
        return model.getAll();
    }


}
