package Projects.Project1OOP.view;

import Projects.Project1OOP.model.objects.Banks.Bank;
import Projects.Project1OOP.model.objects.Deposits.Deposit;

import java.util.List;

public class MainView {

    public static final String INPUT = "Input deposit rate for search pls";

    public void printList(List<?> List) {
        List.forEach(System.out::println);
    }

    public void printMenu(){
        System.out.println("============================");
        System.out.println("|   MENU SELECTION DEMO    |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|        1. All Banks      |");
        System.out.println("|        2. All deposits   |");
        System.out.println("|        3. Sort by profit |");
        System.out.println("|        4. Get by rate    |");
        System.out.println("|        5. quit           |");
        System.out.println("============================");
        System.out.println("Select options");
    }


    public void printInput(){
        System.out.println(INPUT);
    }

    public void printDeposit(Deposit deposit){
        System.out.println(deposit);
    }
}
