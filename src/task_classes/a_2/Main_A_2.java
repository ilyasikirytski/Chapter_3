package task_classes.a_2;

import java.util.Arrays;

public class Main_A_2 {
    public static void main(String[] args) {
        Customer[] arrOfCustomers = new Customer[]{
                new Customer("1", "1", "D", "1", "1", 1, "1"),
                new Customer("2", "2", "C", "2", "2", 2, "2"),
                new Customer("3", "3", "B", "3", "3", 3, "3"),
                new Customer("4", "4", "A", "4", "4", 4, "4")
        };
        alphabetSort(arrOfCustomers);
        bankCardInRange(arrOfCustomers, 0, 3);
    }

    static void alphabetSort(Customer[] arrOfCustomers) {
        System.out.println("Клиенты отсортированные в алфавитном порядке");
        Arrays.sort(arrOfCustomers);
        for (Customer customers : arrOfCustomers) {
            System.out.println(customers);
        }
    }

    static void bankCardInRange(Customer[] arrOfCustomers, int rangeFrom, int rangeTo) {
        System.out.printf("Клиенты, банковские карты которых входят в диапазон от %s до %s%n", rangeFrom, rangeTo);
        for (Customer customers : arrOfCustomers) {
            if (customers.getCardNumber() > rangeFrom && customers.getCardNumber() < rangeTo) {
                System.out.println(customers);
            }
        }
    }
}
