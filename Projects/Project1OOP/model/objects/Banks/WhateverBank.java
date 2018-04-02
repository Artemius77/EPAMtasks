package Projects.Project1OOP.model.objects.Banks;

import Projects.Project1OOP.model.objects.Deposits.Deposit;
import Projects.Project1OOP.model.objects.Deposits.ImmutableDeposit;

public class WhateverBank extends Bank {


    public WhateverBank( int rate, int minSum, int maxSum) {
        super("Random Bank", new ImmutableDeposit(rate, minSum,maxSum));
    }

    @Override
    public String toString() {
        return getName();
    }
}
