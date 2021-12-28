package task_classes.a_2;// task_classes.a_2.Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
//Номер банковского счета.
//Создать массив объектов. Вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится
//в заданном интервале.

public class Customer {
    String id;
    String surName;
    String name;
    String patronymic;
    String address;
    int cardNumber;
    String bankNumber;

    public Customer(String id, String surName, String name, String patronymic, String address, int cardNumber, String bankNumber) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public Customer(String id, String surName, String name, String patronymic) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
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

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public String toString() {
        return "id - " + id +
                " Sur Name - " + surName +
                " Name - " + name +
                " Patronymic - " + patronymic +
                " Address - " + address +
                " Card Number - " + cardNumber +
                " Bank Number - " + bankNumber;
    }
}
