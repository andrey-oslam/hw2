/**
 * @author Andrey Oslam
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
        new Student("Иванов", "Иван", "Иванович", 23),
        new Student("Петров", "Петр", "Петрович", 24),
        new Student("Сидоров", "Андрей", "Петрович", 26),
        new Student("Федоров", "Николай", "Иванович", 25),
        new Student("Зеленский", "Владимир", "Александрович", 42)
        };
        StudentFactory studentFactory = new StudentFactory();
        System.out.println("Вывод списка студентов с использованием генератора случайных чисел/n" +
                "в качестве номера по порядку");
        studentFactory.showStudentsWithRandomId(students);
        System.out.println("");

        System.out.println("Сортировка по имени студента: ");
        studentFactory.bubbleSortByName(students);
        System.out.println("");

        System.out.println("Сортировка по возврасту студента: ");
        studentFactory.bubbleSortByAge(students);
        System.out.println("");

        System.out.println("Поиск по имени студена");
        studentFactory.findStudent(students, "ндр");
        System.out.println("");

    }
}
