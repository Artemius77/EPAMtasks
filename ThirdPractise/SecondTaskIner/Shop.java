package ThirdPractise.SecondTaskIner;

import java.io.IOException;
import java.util.*;

public class Shop {

    private String name;
    private List<Dept> list = new ArrayList<>();
    private Map<Dept, List<String>> goods = new HashMap<>();

    public Shop() {
        createDept(new Dept("Main","Main shop department", new ArrayList<>(Arrays.asList("Good1","Good2"))));
        tranfGoods();
    }

    public void createDept() throws IOException {

        ConsoleHelper.writeMessage("Input department name: ");
        String name = ConsoleHelper.readString();

        ConsoleHelper.writeMessage("Input desc name: ");
        String desc = ConsoleHelper.readString();

        ConsoleHelper.writeMessage("Input goods amount: ");
        List<String> goods = new ArrayList<>();
        int amount = ConsoleHelper.readInt();

        ConsoleHelper.writeMessage("Input goods name: ");

        for (int i = 0; i < amount; i++) {
            goods.add(ConsoleHelper.readString());
        }

        Dept dept = new Dept(name,desc,goods);
        list.add(dept);
        tranfGoods();
        ConsoleHelper.writeMessage("Department created");

    }

    private void tranfGoods() {
        for (Dept dept: list
             ) {
            goods.put(dept, dept.getGoods());
        }
    }



    public void printShopDescription() {
        for (Map.Entry<Dept, List<String>> pair: goods.entrySet()
             ) {
            System.out.println(pair.getKey().getName() + " :" + pair.getValue());
        }
    }

    public void getAllDept() {
        list.forEach(System.out::println);
    }

    public void sortDeptByName() {
        list.sort(Comparator.comparing(Dept::getName));
    }

    public void createDept(String name, String descr, List<String> goods){
        list.add(new Dept(name, descr, goods));
        tranfGoods();
    }

    public void createDept(Dept dept){
        list.add(dept);
        tranfGoods();
    }

    public void removeDept(Dept dept){
        list.remove(dept);
    }

    public void removeDept(int id){
        goods.remove(list.get(id));
        list.remove(id);
    }

    public void addGood(String good,String name) {
        for (Dept dept: list
             ) {
            if (dept.getName().equals(name))
                dept.getGoods().add(good);
        }
        tranfGoods();
    }

    private class Dept {

        private String name;
        private String descr;
        private List<String> goods;

        public Dept(){};

        public Dept(String name, String descr, List<String> goods) {
            this.name = name;
            this.descr = descr;
            this.goods = goods;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescr() {
            return descr;
        }

        public void setDescr(String descr) {
            this.descr = descr;
        }

        public List<String> getGoods() {
            return goods;
        }

        public void setGoods(List<String> goods) {
            this.goods = goods;
        }

        @Override
        public String toString() {
            return "Dept{" +
                    "name='" + name + '\'' +
                    ", descr='" + descr + '\'' +
                    ", goods=" + goods +
                    '}';
        }
    }

}
