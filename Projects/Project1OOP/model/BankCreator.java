package Projects.Project1OOP.model;

import Projects.Project1OOP.model.objects.Banks.AlphaBank;
import Projects.Project1OOP.model.objects.Banks.Bank;
import Projects.Project1OOP.model.objects.Banks.PrivateBank;
import Projects.Project1OOP.model.objects.Banks.WhateverBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCreator {



    public static List<Bank> createBanks(){

        return new ArrayList<>(Arrays.asList(
                new AlphaBank(12, 1000, 180),
                new PrivateBank(17, 111, 30,200,1000),
                new WhateverBank(60, 33, 55)
        ));
    }

}
