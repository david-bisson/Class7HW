import java.io.IOException;

public class User {

    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public User(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException {
        this.name = name;
        WriteToLog log = WriteToLog.getInstance();
        log.getTextAndWriteToLog(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IOException {
        this.age = age;
        WriteToLog log = WriteToLog.getInstance();
        log.getTextAndWriteToLog(String.valueOf(age));
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws IOException {
        this.address = address;
        WriteToLog log = WriteToLog.getInstance();
        log.getTextAndWriteToLog(address);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IOException {
        this.phoneNumber = phoneNumber;
        WriteToLog log = WriteToLog.getInstance();
        log.getTextAndWriteToLog(phoneNumber);
    }
}
