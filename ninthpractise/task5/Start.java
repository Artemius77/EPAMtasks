package ninthpractise.task5;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Start {

    private static ExecutorService executorService = Executors.newCachedThreadPool();

    static void RecursiveThread(File arr, File output) throws IOException {

      //  new Thread(new FileThread(arr,'a', output)).start();
        executorService.execute(new FileThread(arr,'a', output));

        for (File f : arr.listFiles())
        {

             if(f.isDirectory())
            {
                System.out.println("[" + f.getName() + "]");
                RecursiveThread(f,output);
            }

        }
    }


    public static void main(String[] args) throws IOException {
        String maindirpath = "C:\\ThreadTest";
        String file = "C:\\ThreadTest.txt";

        File maindir = new File(maindirpath);
        File output = new File(file);

        if(maindir.exists() && maindir.isDirectory())
        {

            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("**********************************************");

            try {
                RecursiveThread(maindir,output);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }

        BufferedReader reader = new BufferedReader(new FileReader(output));
        String line;
        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }
    }
}
