package Projects.Project1OOP.model.objects.Banks;

import Projects.Project1OOP.model.objects.Deposits.Deposit;
import Projects.Project1OOP.model.objects.Deposits.MutableDeposit;

public class PrivateBank extends Bank {



    public PrivateBank(Integer rate, Integer minSum, Integer duration, Integer minDurationForChange,
                       Integer maxSumToTakePerMonth) {
        super("Private Bank", new MutableDeposit(rate, minSum, duration,
                minDurationForChange, maxSumToTakePerMonth));
    }

    @Override
    public String toString() {
        return getName();
    }
}
