package task_classes.a_2;

import java.util.Arrays;

public class Main_A_2 {
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

    // TODO убрать массив имен, отсортировать по имени именно массив Customer
    static void alphabetSort(Customer[] arrOfCustomers, String[] names) {
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

    static void bankCardInRange(Customer[] arrOfCustomers, int rangeFrom, int rangeTo) {
        System.out.printf("Клиенты, банковские карты которых входят в диапазон от %s до %s%n", rangeFrom, rangeTo);
        for (Customer customers : arrOfCustomers) {
            if (customers.cardNumber > rangeFrom && customers.cardNumber < rangeTo) {
                System.out.println(customers);
            }
        }
    }
}
