/*
Создать классы, спецификации которых приведены ниже.
Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
 */

public class Student {
    String id;
    String surName;
    String name;
    String patronymic;
    String birthDate;
    String address;
    String phoneNumber;
    String faculty;
    String course;
    String group;

    public Student(String id, String surName, String name, String patronymic, String birthDate,
                   String address, String phoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String id) {
        this.id = id;
    }

    void sortByFaculty(String faculty) {
        if (faculty.equals(this.faculty)) {
            System.out.printf("Cтуденты из %s факультета %n" +
                            "Student id: %s%n" +
                            "Sur name: %s%n" +
                            "Name: %s%n" +
                            "Patronymic: %s%n" +
                            "BirthDate: %s%n" +
                            "Address: %s%n" +
                            "PhoneNumber: %s%n" +
                            "Faculty: %s%n" +
                            "Cource: %s%n" +
                            "Group: %s%n",
                    faculty, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
                    this.phoneNumber, this.faculty, this.course, this.group);
            System.out.println("-------------------");
        }
    }

    void sortByFacultyAndCource(String faculty, String course) {
        if (faculty.equals(this.faculty) && course.equals(this.course)) {

            System.out.printf("Соответсвующие критериям %s факультет и %s курс : %n" +
                            "Student id: %s%n" +
                            "Sur name: %s%n" +
                            "Name: %s%n" +
                            "Patronymic: %s%n" +
                            "BirthDate: %s%n" +
                            "Address: %s%n" +
                            "PhoneNumber: %s%n" +
                            "Faculty: %s%n" +
                            "Cource: %s%n" +
                            "Group: %s%n",
                    faculty, course, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
                    this.phoneNumber, this.faculty, this.course, this.group);
            System.out.println("-------------------");
        }
    }

    void sortByBirthDate(String birthDate) {
        if (Integer.parseInt(birthDate) < Integer.parseInt(this.birthDate)) {
            System.out.printf("Родились после %s %n" +
                            "Student id: %s%n" +
                            "Sur name: %s%n" +
                            "Name: %s%n" +
                            "Patronymic: %s%n" +
                            "BirthDate: %s%n" +
                            "Address: %s%n" +
                            "PhoneNumber: %s%n" +
                            "Faculty: %s%n" +
                            "Cource: %s%n" +
                            "Group: %s%n",
                    birthDate, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
                    this.phoneNumber, this.faculty, this.course, group);
            System.out.println("-------------------");
        }
    }

    void sortByGroup(String group) {
        if (group.equals(this.group)) {
            System.out.printf("Студенты из группы %s%n" +
                            "Student id: %s%n" +
                            "Sur name: %s%n" +
                            "Name: %s%n" +
                            "Patronymic: %s%n" +
                            "BirthDate: %s%n" +
                            "Address: %s%n" +
                            "PhoneNumber: %s%n" +
                            "Faculty: %s%n" +
                            "Cource: %s%n" +
                            "Group: %s%n",
                    group, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
                    this.phoneNumber, this.faculty, this.course, this.group);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "7",
                "4");
        Student student2 = new Student("2",
                "2",
                "2",
                "2",
                "2",
                "2",
                "2",
                "2",
                "8",
                "5");
        Student student3 = new Student("3",
                "3",
                "3",
                "3",
                "3",
                "3",
                "3",
                "3",
                "9",
                "6");
        Student student4 = new Student("3",
                "3",
                "3",
                "3",
                "4",
                "3",
                "3",
                "3",
                "10",
                "6");

        Student[] arrOfStudents = new Student[4];
        arrOfStudents[0] = student;
        arrOfStudents[1] = student2;
        arrOfStudents[2] = student3;
        arrOfStudents[3] = student4;

//     "1"; "2"; "3" - аргументы для сортировки по факультетам
//      "4"; "5"; "6"; - аргументы для сортировки по группам
//      "1"; "2"; "3"; - аргументы для сортировки кто родился после указанного числа
//      3|10; 3|9; 2|8; 1|7 - поиск по факультету и курсу
        for (Student s : arrOfStudents) {
            s.sortByFaculty("1");
            s.sortByGroup("5");
            s.sortByBirthDate("3");
            s.sortByFacultyAndCource("3", "10");
        }
    }
}
