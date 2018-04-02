package Projects.Project1OOP.model.objects.Banks;

import Projects.Project1OOP.model.objects.Deposits.Deposit;

public abstract class Bank {

    private String name;
    private Deposit deposit;


    public Bank(String name, Deposit deposit) {
        this.name = name;
        this.deposit = deposit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    protected void getDepositDescription(){
        System.out.println("Current bank: " + getName());
        System.out.println("Current Deposit: " + deposit);
    }


    public abstract String toString();
}

