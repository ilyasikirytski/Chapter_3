// Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
//Номер банковского счета.
//Создать массив объектов. Вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится
//в заданном интервале.

import java.util.Arrays;

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
        return "Customer id - " + id +
                " Sur Name - " + surName +
                " Name - " + name +
                " Patronymic - " + patronymic +
                " Address - " + address +
                " Card Number - " + cardNumber +
                " Bank Number - " + bankNumber;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("1", "1", "D", "1", "1", 1, "1");
        Customer customer2 = new Customer("2", "2", "C", "2", "2", 2, "2");
        Customer customer3 = new Customer("3", "3", "B", "3", "3", 3, "3");
        Customer customer4 = new Customer("4", "4", "A", "4", "4", 4, "4");
        Customer[] arrOfCustomers = new Customer[4];
        String[] names = new String[arrOfCustomers.length];
        arrOfCustomers[0] = customer;
        arrOfCustomers[1] = customer2;
        arrOfCustomers[2] = customer3;
        arrOfCustomers[3] = customer4;

        alphabetSort(arrOfCustomers, names);
        bankCardInRange(arrOfCustomers, 0, 5);
    }
    static void alphabetSort(Customer[] arrOfCustomers, String[] names){
        System.out.println("Клиенты отсортированные в алфавитном порядке");
        for (int i = 0; i < arrOfCustomers.length; i++) {
            names[i] = arrOfCustomers[i].name;
        }
        Arrays.sort(names);
        for (String name : names) {
            for (Customer customers : arrOfCustomers) {
                if (name.equals(customers.name)) {
                    System.out.println(customers);
                }
            }
        }
    }

    static void bankCardInRange(Customer[] arrOfCustomers, int rangeFrom, int rangeTo){
        System.out.printf("Клиенты, банковские карты которых входят в диапазон от %s до %s%n", rangeFrom, rangeTo);
        for (Customer customers : arrOfCustomers) {
            if (customers.cardNumber > rangeFrom && customers.cardNumber < rangeTo) {
                System.out.println(customers);
            }
        }
    }
}
