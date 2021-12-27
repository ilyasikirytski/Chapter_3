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

    @Override
    public String toString() {
        return "Id" + id +
                "Sur Name" + surName +
                "Name " + name +
                "Patronymic" + patronymic +
                "Address" + address +
                "Telephone Number" + telNumber +
                "Medical Card Number" + medicCardNumber +
                "Diagnosis " + diagnosis;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("1", "1", "1", "1", "1", "1", "1", "1");
        Patient patient2 = new Patient("2", "2", "2", "2", "2", "2", "2", "2");
        Patient patient3 = new Patient("3", "3", "3", "3", "3", "3", "3", "3");
        Patient patient4 = new Patient("4", "4", "4", "4", "4", "4", "4", "4");
    }
}
