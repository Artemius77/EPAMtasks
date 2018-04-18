package SecondPractise.SeventhPractise.Models.FileUtils;

import SecondPractise.SeventhPractise.Models.objects.Patient;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private BufferedReader reader;
    private String path = "src/SecondPractise/SeventhPractise/patients.txt";
    private String path2 = "src/SecondPractise/SeventhPractise/patientsContainer.txt";
    final static Logger logger = Logger.getLogger(FileUtil.class);

    {
        try  {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            logger.error("File not found!Sry!", e);
            throw new RuntimeException(e);
        }
    }

    public FileUtil(String path, String path2)  {
        this.path = path;
        this.path2 = path2;
    }

    public FileUtil() {
    }

    public List<String> getFileContent() throws IOException {
        List<String> content = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            content.add(line);
        }

        return content;
    }

    public void close() throws IOException {
        reader.close();
    }

    public void putObjectsInFile(Patient[] patients)  {
        try(ObjectOutputStream outputStream =
                    new ObjectOutputStream(new FileOutputStream(path2));) {
            outputStream.writeObject(patients);
        } catch (IOException e) {
            logger.error("Error while serialization", e);
        }
    }

    public Patient[] getObjectsFromFile() {
        Patient[] patients = null;
        try(ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream(path2))) {

          patients =  (Patient[]) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            logger.error("Error while deserialization", e);
        }

        return patients;
    }



}
