package Collections;

public class Phonebook {
    private String surname;
    private int number;

    public Phonebook(String surname, int number) {
        this.surname = surname;
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }
}
