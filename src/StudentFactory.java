import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Andrey Oslam
 */
public class StudentFactory {

    public void showStudentsWithRandomId(Student[] students) {

        for (Student student : students) {
            int nextId;
            Random generator = new Random();
            nextId = generator.nextInt(30);
            nextId++;
            System.out.println(nextId + ". " + "Студент " +
                    ", Фамилия: " + student.getLastName() +
                    ", имя: " + student.getFirsName() +
                    ", отчество: " + student.getSurname() +
                    ", возвраст: " + student.getAge());
        }
    }

    public void bubbleSortByName(Student[] students) {
        int n = students.length;
        Student temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students[j - 1].getFirsName().compareTo(students[j].getFirsName()) > 0) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        printStudents(students);
    }

    public void bubbleSortByAge(Student[] students) {
        int n = students.length;
        Student temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students[j - 1].getAge() > students[j].getAge()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        printStudents(students);
    }


    public void printStudents(Student[] students) {
        for (Student student : students)
            System.out.println("Студент " +
                    ", Фамилия: " + student.getLastName() +
                    ", имя: " + student.getFirsName() +
                    ", отчество: " + student.getSurname() +
                    ", возвраст: " + student.getAge());
    }

    public void findStudent(Student[] students, String nameStudent) {
        for (int i = 0; i < students.length; i++) {
        Pattern pattern = Pattern.compile(nameStudent);
        Matcher matcher = pattern.matcher(students[i].getFirsName());
            if(matcher.find()) {
                System.out.println("Студент " +
                        ", Фамилия: " + students[i].getLastName() +
                        ", имя: " + students[i].getFirsName() +
                        ", отчество: " + students[i].getSurname() +
                        ", возвраст: " + students[i].getAge());
            }
            }
        }
    public Student[] findStudent6(Student[] students, String nameStudent) {
        for (int i = 0; i < students.length; i++) {
            Pattern pattern = Pattern.compile(nameStudent);
            Matcher matcher = pattern.matcher(students[i].getFirsName());
            if(matcher.find()) {
                return new Student[i];
            } else
                return null;
        }
        return students;
    }
    }


