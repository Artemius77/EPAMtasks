package Projects.Project1OOP.model.objects.Banks;

import Projects.Project1OOP.model.objects.Deposits.Deposit;
import Projects.Project1OOP.model.objects.Deposits.ImmutableDeposit;

public class AlphaBank extends Bank {


    public AlphaBank( int rate, int minSum, int maxSum) {
        super("Alpha Bank", new ImmutableDeposit(rate,minSum,maxSum));
    }

    @Override
    public String toString() {
        return getName();
    }


}
