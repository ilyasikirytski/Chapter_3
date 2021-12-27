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

    public Student(String id, String surName, String name) {
        this.id = id;
        this.surName = surName;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

//    void sortByFaculty(String faculty) {
//        if (faculty.equals(this.faculty)) {
//            System.out.printf("Cтуденты из %s факультета %n" +
//                            "Student id: %s%n" +
//                            "Sur name: %s%n" +
//                            "Name: %s%n" +
//                            "Patronymic: %s%n" +
//                            "BirthDate: %s%n" +
//                            "Address: %s%n" +
//                            "PhoneNumber: %s%n" +
//                            "Faculty: %s%n" +
//                            "Cource: %s%n" +
//                            "Group: %s%n",
//                    faculty, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
//                    this.phoneNumber, this.faculty, this.course, this.group);
//            System.out.println("-------------------");
//        }
//    }
//
//    void sortByFacultyAndCource(String faculty, String course) {
//        if (faculty.equals(this.faculty) && course.equals(this.course)) {
//            System.out.printf("Соответсвующие критериям %s факультет и %s курс : %n" +
//                            "Student id: %s%n" +
//                            "Sur name: %s%n" +
//                            "Name: %s%n" +
//                            "Patronymic: %s%n" +
//                            "BirthDate: %s%n" +
//                            "Address: %s%n" +
//                            "PhoneNumber: %s%n" +
//                            "Faculty: %s%n" +
//                            "Cource: %s%n" +
//                            "Group: %s%n",
//                    faculty, course, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
//                    this.phoneNumber, this.faculty, this.course, this.group);
//            System.out.println("-------------------");
//        }
//    }
//
//    void sortByBirthDate(String birthDate) {
//        if (Integer.parseInt(birthDate) < Integer.parseInt(this.birthDate)) {
//            System.out.printf("Родились после %s %n" +
//                            "Student id: %s%n" +
//                            "Sur name: %s%n" +
//                            "Name: %s%n" +
//                            "Patronymic: %s%n" +
//                            "BirthDate: %s%n" +
//                            "Address: %s%n" +
//                            "PhoneNumber: %s%n" +
//                            "Faculty: %s%n" +
//                            "Cource: %s%n" +
//                            "Group: %s%n",
//                    birthDate, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
//                    this.phoneNumber, this.faculty, this.course, group);
//            System.out.println("-------------------");
//        }
//    }
//
//    void sortByGroup(String group) {
//        if (group.equals(this.group)) {
//            System.out.printf("Студенты из группы %s%n" +
//                            "Student id: %s%n" +
//                            "Sur name: %s%n" +
//                            "Name: %s%n" +
//                            "Patronymic: %s%n" +
//                            "BirthDate: %s%n" +
//                            "Address: %s%n" +
//                            "PhoneNumber: %s%n" +
//                            "Faculty: %s%n" +
//                            "Cource: %s%n" +
//                            "Group: %s%n",
//                    group, this.id, this.surName, this.name, this.patronymic, this.birthDate, this.address,
//                    this.phoneNumber, this.faculty, this.course, this.group);
//            System.out.println("-------------------");
//        }
//    }

    @Override
    public String toString() {
        return "id " + id +
                " Sur Name " + surName +
                " Name " + name +
                " Patronymic " + patronymic +
                " Birth Date " + birthDate +
                " Address " + address +
                " Phone Number " + phoneNumber +
                " Faculty " + faculty +
                " Cource " + course +
                " Group " + group;
    }

    public static void main(String[] args) {
        Student student = new Student("1", "1", "1", "1", "1", "1", "1", "1", "7", "4");
        Student student2 = new Student("2", "2", "2", "2", "2", "2", "2", "2", "8", "5");
        Student student3 = new Student("3", "3", "3", "3", "3", "3", "3", "3", "9", "6");
        Student student4 = new Student("3", "3", "3", "3", "4", "3", "3", "3", "10", "6");

        Student[] arrOfStudents = new Student[4];
        arrOfStudents[0] = student;
        arrOfStudents[1] = student2;
        arrOfStudents[2] = student3;
        arrOfStudents[3] = student4;

//     "1"; "2"; "3" - аргументы для сортировки по факультетам
        sortByFaculty(arrOfStudents, "2");
//      "4"; "5"; "6"; - аргументы для сортировки по группам
        sortByGroup(arrOfStudents, "4");
//      "1"; "2"; "3"; - аргументы для сортировки кто родился после указанного числа
        sortByBirthAfter(arrOfStudents, "1");
//      3|10; 3|9; 2|8; 1|7 - списки студентов для каждого факультета и курса;
        sortByFacultyAndGroup(arrOfStudents, "3", "10");


    }

    //    список учебной группы.
    static void sortByGroup(Student[] students, String group) {
        System.out.println("Студенты отсортированны по заданной группе ");
        for (Student s : students) {
            if (s.getGroup().equals(group)) {
                System.out.println(s);
            }
        }
    }

    //    список студентов заданного факультета
    static void sortByFaculty(Student[] students, String faculty) {
        System.out.println("Студенты отсортированны по заданному факультету ");
        for (Student s : students) {
            if (s.getFaculty().equals(faculty)) {
                System.out.println(s);
            }
        }
    }

    //    список студентов, родившихся после заданного года;
    static void sortByBirthAfter(Student[] students, String birthDate) {
        System.out.println("Студенты родившиеся после указанного года");
        for (Student s : students) {
            if (s.getBirthDate().equals(birthDate)) {
                System.out.println(s);
            }
        }
    }

    //    списки студентов для каждого факультета и курса;
    static void sortByFacultyAndGroup(Student[] students, String faculty, String course) {
        System.out.printf("Студенты отсортированные по %s факультету и %s курсу %n", faculty, course);
        for (Student s : students) {
            if ((s.getFaculty().equals(faculty)) && (s.getCourse().equals(course))) {
                System.out.println(s);
            }
        }
    }
}
