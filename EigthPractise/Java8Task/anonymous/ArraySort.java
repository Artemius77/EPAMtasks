package EigthPractise.Java8Task.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ArraySort {

    public static int[] createArray(int n){
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = createArray(20);
        System.out.println(Arrays.toString(array));
        array = IntStream.of(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(array));

      //  Arrays.stream(array).filter()
        String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};

        System.out.println(Arrays.toString(months)); //printing before

        Arrays.sort(months, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(months)); //printing after

        System.out.println(
                modify(array, x -> x > 5, x -> x - 100)
        );

        System.out.println(
                getStrings(Arrays.asList(months),x -> x == 'J')
        );

    }


    private static List<Integer> modify(int[] arr, Condition con, MyFunc func) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (con.filter(arr[i]))  result.add(func.calc(arr[i]));
        }
        return result;
    }

    private static List<String> getStrings(List<String> list, StringStart start) {
        List<String> result = new ArrayList<>();
        for (String aList : list) {
            if (start.first(aList.charAt(0))) result.add(aList);
        }
        return result;
    }


@FunctionalInterface
interface Condition {
        boolean filter(int x);
}

    @FunctionalInterface
    interface MyFunc {
         int calc(int x);
    }

    @FunctionalInterface
    interface StringStart {
        boolean first(char x);
    }

}
