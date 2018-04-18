package ninthpractise.task5;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileThread implements Runnable {

    private File directory;
    private char letter;
    private BufferedWriter writer;
    final static Logger logger = Logger.getLogger(FileThread.class);

    public FileThread(File directory, char letter, File output) throws IOException {

        if (!directory.isDirectory()) logger.error("Wrong thread parameter!!");

        this.directory = directory;
        this.letter = letter;
        writer = new BufferedWriter(new FileWriter(output,true));

    }

    @Override
    public void run() {
        String[] textFiles = directory.list((dir, name) -> name.endsWith(".txt"));

        if (textFiles == null) return;


        for (String fileName :
                textFiles) {
        //    System.out.println(fileName + " " + count(directory + "\\" + fileName));
            try {
                writer.write(fileName + " " + count(directory + "\\" + fileName));
                writer.newLine();
            } catch (IOException e) {
                logger.error("exception while writing in file", e);
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int count(String name){

        int result = 0;
        String line;
        String regexp ="^| " + letter + "\\w+";
        Pattern pattern = Pattern.compile(regexp);

        try (BufferedReader reader = new BufferedReader(new FileReader(name))){

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find())
                    result++;
            }

        } catch (FileNotFoundException e) {
            logger.error("cant find file!",e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
