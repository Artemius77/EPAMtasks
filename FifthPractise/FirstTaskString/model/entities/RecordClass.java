package FifthPractise.FirstTaskString.model.entities;

public class RecordClass {

    private String name;
    private String lastName;
    private String birthday;
    private String number;
    private String location;

    public RecordClass(String name, String lastName, String birthday, String number, String location) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.number = number;
        this.location = location;
    }

    public RecordClass(){}

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "RecordClass{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", number='" + number + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
