package ninthpractise.task3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapPerformance {

    private static final int NB_THREADS = 7;
    private static final int NB_TEST_ITERATIONS = 7;

    public static void main(String[] args) {
        System.out.println("Concurrent vs Hash Test");

        System.out.println("HashMap test");
        testMap(new HashMap<>());

        System.out.println("_________________________");

        System.out.println("ConcurrentMap test");
        testMap(new ConcurrentHashMap<>());

    }

    public static void testMap(Map<String, Integer> map) {
        for (int i = 0; i < NB_TEST_ITERATIONS; i++) {

            ExecutorService executor = Executors.newFixedThreadPool(NB_THREADS);

            long timeAfter;
            Float totalProcessingTime;
            long timeBefore = System.currentTimeMillis();


            for (int j = 0; j < NB_THREADS; j++) {
                Runnable worker = new WorkerThread(map);
                executor.execute(worker);
            }

            // This will make the executor accept no new threads
            // and finish all existing threads in the queue
            executor.shutdown();

            // Wait until all threads are finish
            while (!executor.isTerminated()) {
            }

            timeAfter = System.currentTimeMillis();
            totalProcessingTime = (float) (timeAfter - timeBefore) / (float) 1000;
            System.out.println("All threads completed in " + totalProcessingTime + " seconds");
        }
    }
}
