package ThirdPractise.ThirdTaskGenerics.GeneralClasses;

import java.util.*;
import java.util.stream.Collectors;

public class Train<T extends AbstractCarriage> {

   private List<T> carriages ;

   public void add(T carriage) {
       carriages.add(carriage);
   }

    public void sortByComfort(){
       carriages.sort(Comparator.comparing((T::getComfortLvl)).reversed());
    }

    public int getAllPasseng(){
      return carriages.stream().mapToInt(AbstractCarriage::getPassengers).sum();
    }

    public int getAllBaggage(){
        return carriages.stream().mapToInt(AbstractCarriage::getBaggage).sum();
    }

    public List<T> getDiapason(int from, int to) {
       return carriages.stream().filter(s -> s.getPassengers() >= from && s.getPassengers() <= to)
               .collect(Collectors.toList());
    }

    public void printAll() {
       carriages.forEach(System.out::println);
    }

    public Train(List<T> carriages) {
      this. carriages = carriages;
    }
}
