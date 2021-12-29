package task_classes.a_1;

public class Main_a_1 {
    // TODO вынести создание студентов в оттельный метод, использовать конструктор массива {}
    public static void main(String[] args) {
        Student student = new Student("1", "1", "1", "1", 1, "1", "1", "1", "7", "4");
        Student student2 = new Student("2", "2", "2", "2", 2, "2", "2", "2", "8", "5");
        Student student3 = new Student("3", "3", "3", "3", 3, "3", "3", "3", "9", "6");
        Student student4 = new Student("3", "3", "3", "3", 4, "3", "3", "3", "10", "6");

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
        sortByBirthAfter(arrOfStudents, 1);
//      3|10; 3|9; 2|8; 1|7 - списки студентов для каждого факультета и курса;
        sortByFacultyAndGroup(arrOfStudents, "3", "10");


    }


    //    список учебной группы.
    // TODO сделать private
    static void sortByGroup(Student[] students, String group) {
        System.out.println("Студенты отсортированны по заданной группе ");
        for (Student s : students) {
            if (s.getGroup().equals(group)) {
                System.out.println(s);
            }
        }
    }

    //    список студентов заданного факультета
    // TODO сделать private
    static void sortByFaculty(Student[] students, String faculty) {
        System.out.println("Студенты отсортированны по заданному факультету ");
        for (Student s : students) {
            if (s.getFaculty().equals(faculty)) {
                System.out.println(s);
            }
        }
    }

    //    список студентов, родившихся после заданного года;
    // TODO сделать private
    static void sortByBirthAfter(Student[] students, int birthDate) {
        System.out.println("Студенты родившиеся после указанного года");
        for (Student s : students) {
            if (s.getBirthDate() > birthDate) {
                System.out.println(s);
            }
        }
    }

    //    списки студентов для каждого факультета и курса;
    // TODO сделать private
    static void sortByFacultyAndGroup(Student[] students, String faculty, String course) {
        System.out.printf("Студенты отсортированные по %s факультету и %s курсу %n", faculty, course);
        for (Student s : students) {
            if ((s.getFaculty().equals(faculty)) && (s.getCourse().equals(course))) {
                System.out.println(s);
            }
        }
    }
}
