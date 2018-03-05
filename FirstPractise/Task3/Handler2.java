package FirstPractise.Task3;

public class Handler2 implements  GeneralHandler {


    @Override
    public int[] solution(int number) {
        for (int i = 1; i < number; i++) {
           if (isPerfect(i)) System.out.println(i);
        }
        return new int[]{};
    }

    public boolean isPerfect(int s) {
        int sum = 0 ;

        for (int i = 1; i < s; i++) {
             if (s % i == 0) sum+=i;
        }

        return sum == s;
    }
}
