import java.util.Random;

/**
 * @author Andrey Oslam
 */
public class Student {

    private String lastName;
    private String firsName;
    private String surname;
    private int age;

    public Student(String lastName, String firsName, String surname, int age) {

        this.lastName = lastName;
        this.firsName = firsName;
        this.surname = surname;
        this.age = age;
    }

    public Student() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


