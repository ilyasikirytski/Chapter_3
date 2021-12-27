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

        for (int i = 0; i < arrOfCustomers.length; i++) {
            names[i] = arrOfCustomers[i].name;
        }

        Arrays.sort(names);
        System.out.println("Клиенты отсортированные в алфавитном порядке");
        for (String name : names) {
            for (Customer customers : arrOfCustomers) {
                if (name.equals(customers.name)) {
                    System.out.println(customers);
                }
            }
        }
        System.out.println("Клиенты, банковские карты которых входят в указанный диапазон");
        for (Customer customers : arrOfCustomers) {
            if (customers.cardNumber > 0 && customers.cardNumber < 5) {
                System.out.println(customers);
            }
        }
    }
}
