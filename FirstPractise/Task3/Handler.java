package FirstPractise.Task3;

public class Handler implements GeneralHandler {

    private static int[] search(int a){
        int[] arr = new int[a];
        int index = 0;
        int size = 0;
        for (int i = 1; i <a; i++) {
            if (a % i == 0 ){ arr[index++] = i;}
        }
        return arr;
    }

    private static int sum(int[] arr)
    {
        int sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }
        return sum;
    }

    @Override
    public  int[] solution(int number) {

        StringBuilder string = new StringBuilder();

        for (int i = 1; i < number; i++) {
            int[] arr = search(i);
            if (sum(arr) == i) string.append(i).append(" ");
        }

        int length = string.toString().trim().split(" ").length;

        int[] result = new int[length];

        String[] strings = string.toString().trim().split(" ");

        for (int i = 0; i <strings.length ; i++) {
            result[i] = Integer.parseInt(strings[i]);
        }

        return result;
    }

}
