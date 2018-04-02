package Projects.Project1OOP.model;

import Projects.Project1OOP.model.objects.Banks.Bank;
import Projects.Project1OOP.model.objects.Deposits.Deposit;


import java.util.*;
import java.util.stream.Collectors;

public class GeneralModel {


    private List<Bank> banks = BankCreator.createBanks();

    public GeneralModel() {
    }


    public List<Deposit> sortByProfit() {
        return banks.stream().map(Bank::getDeposit).sorted().collect(Collectors.toList());
    }

    public Deposit searchByRate(int rate) {
        return banks.stream().filter(b -> b.getDeposit().getRate() == rate).findFirst().get().getDeposit();
    }


    public  List<Deposit> getAllDep() {
        return banks.stream().map(Bank::getDeposit).collect(Collectors.toList());
    }

    public  List<Bank> getAll() {
        return banks;
    }

}
