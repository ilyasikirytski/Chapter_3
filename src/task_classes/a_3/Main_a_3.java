package task_classes.a_3;

public class Main_a_3 {
    public static void main(String[] args) {
        Patient[] patients = new Patient[]{
                new Patient("1", "1", "1", "1", "1", "1", "1", "1"),
                new Patient("2", "2", "2", "2", "2", "2", "2", "2"),
                new Patient("3", "3", "3", "3", "3", "3", "3", "3"),
                new Patient("4", "4", "4", "4", "4", "4", "4", "4")
        };

        sortByDiagnosis(patients, "2");
        sortByMedicalCardNum(patients, 0, 5);
    }

    static void sortByDiagnosis(Patient[] patients, String diagnosis) {
        System.out.printf("Пациенты отсортированные по %s диагнозу %n", diagnosis);
        for (Patient p : patients) {
            if (p.getDiagnosis().equals(diagnosis)) {
                System.out.println(p);
            }
        }
    }

    static void sortByMedicalCardNum(Patient[] patients, int rangeFrom, int rangeTo) {
        System.out.printf("Пациенты, номер медицинской карты которых находится в интервале от %s до %s%n", rangeFrom, rangeTo);
        for (Patient p : patients) {
            if (Integer.parseInt(p.getMedicCardNumber()) > rangeFrom && Integer.parseInt(p.getMedicCardNumber()) < rangeTo) {
                System.out.println(p);
            }
        }
    }
}
