package ThirdPractise.SecondTaskIner;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();
        shop.printShopDescription();
        shop.createDept();
        shop.createDept();
        shop.sortDeptByName();
        System.out.println("__________");
        shop.getAllDept();
        System.out.println("__________");
        shop.removeDept(1);
        shop.addGood("Mulo","Main");
        System.out.println("__________");
        shop.getAllDept();
        System.out.println("__________");
        shop.printShopDescription();
    }
}
