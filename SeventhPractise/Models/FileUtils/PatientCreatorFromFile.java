package SecondPractise.SeventhPractise.Models.FileUtils;

import SecondPractise.SeventhPractise.Models.objects.Patient;
import SecondPractise.SeventhPractise.interfaces.Creator;

import java.io.IOException;
import java.util.List;

public class PatientCreatorFromFile implements Creator {

    private FileUtil file= new FileUtil();

    public PatientCreatorFromFile(String path, String path2) {
        this.file = new FileUtil(path,path2);
    }

    public PatientCreatorFromFile() {
    }

    @Override
    public Patient[] simpleCreate() throws IOException {
        List<String> tempList= file.getFileContent();
        Patient[] patients = new Patient[tempList.size()];
        int index = 0;
        for (String line :
                tempList) {

            String[] attributes = line.split(" ");
            patients[index] = new Patient(
                    parseString(attributes[0]),
                    parseString(attributes[1]),
                    parseString(attributes[2]),
                    parseString(attributes[3]),
                    parseString(attributes[4]),
                    Integer.parseInt(parseString(attributes[5])),
                    parseString(attributes[6])
            );

            index++;
        }

        file.close();
        return patients;

    }

    public FileUtil getFile() {
        return file;
    }

    private String parseString(String line) {
        return line.substring(line.indexOf(":")+1);
    }


}
