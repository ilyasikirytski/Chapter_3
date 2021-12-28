package task_classes.a_3;

/*task_classes.a_3.Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
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
}
