package task2;

public class Buyer {
    private String surname;
    private String name;
    private int phoneNumber;

    public Buyer(String surname, String name, int phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Покупатель: " + surname + ' ' + name + ' ' + phoneNumber;
    }
}
