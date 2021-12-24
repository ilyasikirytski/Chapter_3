public class Main {
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
