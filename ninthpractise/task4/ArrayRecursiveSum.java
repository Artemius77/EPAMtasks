package ninthpractise.task4;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ArrayRecursiveSum extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 20;
    private static final int NUMS_THREAD = 8;
    /**
     * Pool of worker threads.
     */
    private static final ForkJoinPool fjPool = new ForkJoinPool(NUMS_THREAD);

    private int from, to;
    private int[] arr;

    public ArrayRecursiveSum(int[] arr, int from, int to) {
        this.from = from;
        this.to = to;
        this.arr = arr;
    }

    @Override
    public Integer compute() {
        if (to - from <= THRESHOLD) {
            int ans = 0;
            for (int i = from; i < to; i++) {
                ans += arr[i];
            }
            return ans;
        } else {
            int mid = (from + to) / 2;
            ArrayRecursiveSum left = new ArrayRecursiveSum(arr, from, mid);
            ArrayRecursiveSum right = new ArrayRecursiveSum(arr, mid, to);
            left.fork();
            int rightAns = right.compute();
            int leftAns = left.join();
            return leftAns + rightAns;
        }
    }


    public static int sum(int[] arr)  {
        return fjPool.invoke(new ArrayRecursiveSum(arr, 0, arr.length));
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[1_000_000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        int sum = sum(arr);

     //   System.out.println("Sum: " + sum);

        System.out.println(Arrays.stream(arr).sum() == sum);
    }
}
