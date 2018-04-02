package SecondPractise.SixthPractise.Models.FileUtils;

import SecondPractise.SixthPractise.Models.objects.Patient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private BufferedReader reader;
    private String path = "src/SecondPractise/SixthPractise/patients.txt";
    private String path2 = "src/SecondPractise/SixthPractise/patientsContainer.txt";

    {
        try  {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
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
            e.printStackTrace();
        }
    }

    public Patient[] getObjectsFromFile() {
        Patient[] patients = null;
        try(ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream(path2))) {

          patients =  (Patient[]) inputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return patients;
    }



}
