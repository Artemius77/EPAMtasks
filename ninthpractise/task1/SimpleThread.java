package ninthpractise.task1;

public class SimpleThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");
       Thread thread1 =  new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           System.out.println("Bomb!");
        });

       thread1.start();
       thread1.join();

        System.out.println("Main thread end.");
    }
}
