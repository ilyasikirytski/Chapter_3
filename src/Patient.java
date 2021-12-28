/*Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.*/
public class Patient {
    String id;
    String surName;
    String name;
    String patronymic;
    String address;
    String telNumber;
    String medicCardNumber;
    String diagnosis;

    public Patient(String id, String surName, String name, String patronymic, String address, String telNumber, String medicCardNumber, String diagnosis) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.telNumber = telNumber;
        this.medicCardNumber = medicCardNumber;
        this.diagnosis = diagnosis;
    }

    public Patient(String id, String surName, String name) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getMedicCardNumber() {
        return medicCardNumber;
    }

    public void setMedicCardNumber(String medicCardNumber) {
        this.medicCardNumber = medicCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Id " + id +
                " Sur Name " + surName +
                " Name " + name +
                " Patronymic " + patronymic +
                " Address " + address +
                " Telephone Number " + telNumber +
                " Medical Card Number " + medicCardNumber +
                " Diagnosis " + diagnosis;
    }

    // TODO вынести в отдельный класс все что не нужно patient
    public static void main(String[] args) {
        Patient patient = new Patient("1", "1", "1", "1", "1", "1", "1", "1");
        Patient patient2 = new Patient("2", "2", "2", "2", "2", "2", "2", "2");
        Patient patient3 = new Patient("3", "3", "3", "3", "3", "3", "3", "3");
        Patient patient4 = new Patient("4", "4", "4", "4", "4", "4", "4", "4");

        Patient[] patients = new Patient[4];
        patients[0] = patient;
        patients[1] = patient2;
        patients[2] = patient3;
        patients[3] = patient4;

        sortByDiagnosis(patients, "2");
        sortByMedicalCardNum(patients, 0, 5);
    }

    static void sortByDiagnosis(Patient[] patients, String diagnosis){
        System.out.printf("Пациенты отсортированные по %s диагнозу %n", diagnosis);
        for (Patient p : patients){
            if (p.getDiagnosis().equals(diagnosis)){
                System.out.println(p);
            }
        }
    }

    static void sortByMedicalCardNum(Patient[] patients, int rangeFrom, int rangeTo){
        System.out.printf("Пациенты, номер медицинской карты которых находится в интервале от %s до %s%n", rangeFrom, rangeTo);
        for (Patient p : patients){
            if (Integer.parseInt(p.getMedicCardNumber()) > rangeFrom && Integer.parseInt(p.getMedicCardNumber()) < rangeTo){
                System.out.println(p);
            }
        }
    }
}
