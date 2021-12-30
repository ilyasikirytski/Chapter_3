package task_classes.b_8;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

// DO замечания такие же как в 7-ой задачче
public class Main_b_8 {
    public static void main(String[] args) {
        Quadrilateral[] quadrilaterals = new Quadrilateral[]{
                new Quadrilateral(1, 1, 1, 1),
                new Quadrilateral(2, 2, 2, 2),
                new Quadrilateral(3, 4, 3, 4),
                new Quadrilateral(4, 4, 5, 5)
        };

        ArrayList<Quadrilateral> groupOfQuadril = new ArrayList<>();
        ArrayList<Quadrilateral> groupOfRectangle = new ArrayList<>();
        ArrayList<Quadrilateral> groupOfRhombus = new ArrayList<>();

        findingSquare(quadrilaterals);
        findingPerimeter(quadrilaterals);
        groupingOfQuadLaterals(quadrilaterals, groupOfQuadril, groupOfRectangle, groupOfRhombus);
        numberOfQuadlateralsInGroup(groupOfQuadril, groupOfRectangle, groupOfRhombus);
        maxAndMinSqrt(groupOfQuadril, groupOfRectangle, groupOfRhombus);
    }

    static double square(Quadrilateral quadrilaterals) {
        return (sqrt(quadrilaterals.perimeter() * (quadrilaterals.perimeter() - quadrilaterals.getA()) * (quadrilaterals.perimeter() - quadrilaterals.getB()) * (quadrilaterals.perimeter() - quadrilaterals.getC())));
    }

    static void findingSquare(Quadrilateral[] quadrilaterals) {
        System.out.println("---------------------");
        for (Quadrilateral q : quadrilaterals) {
            System.out.printf("Площадь %s равна: %s%n", q, square(q));
        }
    }

    static void findingPerimeter(Quadrilateral[] quadrilaterals) {
        System.out.println("---------------------");
        for (Quadrilateral q : quadrilaterals) {
            System.out.printf("Периметр %s равен: %s%n", q, q.perimeter());
        }
    }

    static void print(Quadrilateral q, String str) {
        System.out.println("Четырёхугольник со сторонами {" +
                "a=" + q.getA() +
                ", b=" + q.getB() +
                ", c=" + q.getC() +
                ", d=" + q.getD() +
                '}' + " - " + str);
    }

    // DO названия методов с глаголом
    // DO периметр в отдельный метод, лучше в Triangle
    // DO вывод на экран и группировку разделить на 2 метода
    // DO вынести определение типа треугольника в отдельный метод
    static void groupingOfQuadLaterals(Quadrilateral[] quadrilaterals, ArrayList<Quadrilateral> groupOfQuadril, ArrayList<Quadrilateral> groupOfRectangle, ArrayList<Quadrilateral> groupOfRhombus) {
        System.out.println("---------------------");
        for (Quadrilateral q : quadrilaterals) {
            if (q.groupingOfQuadril(q, groupOfQuadril)) {
                print(q, "Квадрат");
            } else if (q.groupingOfRectangle(q, groupOfRectangle)) {
                print(q, "Прямоугольник");
            } else if (q.groupingOfRhombus(q, groupOfRhombus)) {
                print(q, "Ромб");
            }
        }
    }

    static void numberOfQuadlateralsInGroup(ArrayList<Quadrilateral> groupOfQuadril, ArrayList<Quadrilateral> groupOfRectangle, ArrayList<Quadrilateral> groupOfRhombus) {
        System.out.println("---------------------");
        if (groupOfQuadril != null) {
            System.out.printf("Кол-во квадратов - %s%n", groupOfQuadril.size());
        }
        if (groupOfRectangle != null) {
            System.out.printf("Кол-во прямоугольников - %s%n", groupOfRectangle.size());
        }
        if (groupOfRhombus != null) {
            System.out.printf("Кол-во ромбов - %s%n", groupOfRhombus.size());
        }
    }

    static void maxAndMinSqrt(ArrayList<Quadrilateral> groupOfQuadril, ArrayList<Quadrilateral> groupOfRectangle, ArrayList<Quadrilateral> groupOfRhombus) {
        System.out.println("---------------------");
        System.out.println("Группа квадраты");
        if (!groupOfQuadril.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfQuadril));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfQuadril));
        } else {
            System.out.println("Нет элементов");
        }
        System.out.println("Группа прямоугольники");
        if (!groupOfRectangle.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfRectangle));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfRectangle));
        } else {
            System.out.println("Нет элементов");
        }
        System.out.println("Группа ромбы");
        if (!groupOfRhombus.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfRhombus));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfRhombus));
        } else {
            System.out.println("Нет элементов");
        }
    }
}
