package SecondPractise.Models.objects;

public class Patient {

    private String name;
    private String lastName;
    private String midlName;
    private String addres;
    private String number;
    private int cardNumber;
    private String diagnosis;

    public Patient(String name, String lastName, String midlName, String addres, String number, int cardNumber, String diagnosis) {
        this.name = name;
        this.lastName = lastName;
        this.midlName = midlName;
        this.addres = addres;
        this.number = number;
        this.cardNumber = cardNumber;
        this.diagnosis = diagnosis;
    }

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidlName() {
        return midlName;
    }

    public void setMidlName(String midlName) {
        this.midlName = midlName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", addres='" + addres + '\'' +
                ", number='" + number + '\'' +
                ", cardNumber=" + cardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }


}
