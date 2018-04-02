package FifthPractise.SecondTaskCollections.FirstPartListEnSets;

import java.util.*;

public class Start {


    public static void main(String[] args) {

        List<Integer> list = CollectionGenerator.createList(new IntegerGenerator(), 10);
        System.out.println(list);

        Set<Integer> set = CollectionGenerator.createSet(new IntegerDiapasonGenerator(20,25),10);

      //  Set<Integer> set2 = CollectionGenerator.createSet(new IntegerGenerator(),10);

        System.out.println(set);
      //  Deque<Integer> deque = new ArrayDeque<>();
    }
}

