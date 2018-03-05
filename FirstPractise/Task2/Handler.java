package FirstPractise.Task2;

public class Handler {

    private static void help(int a) {

        int[] arr = new int[2*a - 1];

        for (int i = 0; i <a ; i++) {
            arr[i] = i+1;
        }

        int index = a;
        for (int i = a-1; i >= 1 ; i--) {
            arr[index] = i;
            index++;
        }

        for (int num:
                arr) {
            System.out.print(num);
        }

    }

    private static void charHelp(int number, int size) {

        int space = size - number;
        char[] arr = new char[space];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = ' ';
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void action(int a)    {
        for (int i = 1; i <= a; i++) {
            charHelp(i,a);
            help(i);
            System.out.println();
        }

    }

}
