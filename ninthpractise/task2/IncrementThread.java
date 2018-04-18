package ninthpractise.task2;

public class IncrementThread {

      Integer count = 0;

    public static void main(String[] args)  {

        System.out.println("Main thread start");
        new IncrementThread().execute();

    }

    public void execute()  {
        final Object lock = new Object();
        Thread counter = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {

                synchronized (this) {
                    count++;
                    try {
                        wait();
                        notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread printer = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (this) {
                    notify();
                    System.out.println(count);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        counter.start();
        printer.start();

    }
    @Override
public String toString(){
        return "LOL";
}
}


