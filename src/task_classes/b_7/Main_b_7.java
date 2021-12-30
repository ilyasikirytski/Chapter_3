package task_classes.b_7;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

public class Main_b_7 {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[]{
                new Triangle(1, 1, 1),
                new Triangle(2, 2, 2),
                new Triangle(3, 3, 4),
                new Triangle(2, 2, 4)
        };

        ArrayList<Triangle> groupOfEquilaterals = new ArrayList<>();
        ArrayList<Triangle> groupOfIsosceles = new ArrayList<>();
        ArrayList<Triangle> groupOfUnequals = new ArrayList<>();

        findingSquare(triangles);
        findingPerimeter(triangles);
        groupingOfTriangles(triangles, groupOfEquilaterals, groupOfIsosceles, groupOfUnequals);
        numberOfTrianglesInGroup(groupOfEquilaterals, groupOfIsosceles, groupOfUnequals);
        maxAndMinSquare(groupOfEquilaterals, groupOfIsosceles, groupOfUnequals);
    }

    static double square(Triangle triangle) {
        return sqrt(triangle.perimeter() * (triangle.perimeter() - triangle.getA()) * (triangle.perimeter() - triangle.getB()) * (triangle.perimeter() - triangle.getC()));
    }

    // DO названия методов с глаголом
    // DO площадь в отдельный метод, лучше в Triangle
    static void findingSquare(Triangle[] triangles) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            System.out.printf("Площадь треугольника номер: %s равна: %s%n", i, square(triangles[i]));
        }
    }

    // DO названия методов с глаголом
    static void findingPerimeter(Triangle[] triangles) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            System.out.printf("Периметр треугольника номер: %s равен: %s%n", i, triangles[i].perimeter());
        }
    }

    static void print(Triangle t, String str) {
        System.out.println("Треугольник со сторонами {" +
                "a=" + t.getA() +
                ", b=" + t.getB() +
                ", c=" + t.getC() +
                '}' + " - " + str);
    }

    // DO названия методов с глаголом
    // DO периметр в отдельный метод, лучше в Triangle
    // DO вывод на экран и группировку разделить на 2 метода
    // DO вынести определение типа треугольника в отдельный метод
    static void groupingOfTriangles(Triangle[] triangles, ArrayList<Triangle> groupOfEquilaterals, ArrayList<Triangle> groupOfIsosceles, ArrayList<Triangle> groupOfUnequals) {
        System.out.println("---------------------");
        for (Triangle t : triangles) {
            if (t.isNonExistent()) {
                print(t, "Не существует");
            } else if (t.groupingOfEquilaterals(t, groupOfEquilaterals)) {
                print(t, "Равносторонний");
            } else if (t.groupingOfUnequals(t, groupOfUnequals)) {
                print(t, "Прямоугольный");
            } else if (t.groupingOfIsosceles(t, groupOfIsosceles)) {
                print(t, "Равнобедренный");
            }
        }
    }

    // DO названия методов с глаголом
    static void numberOfTrianglesInGroup(ArrayList<Triangle> groupOfEquilaterals, ArrayList<Triangle> groupOfIsosceles, ArrayList<Triangle> groupOfUnequals) {
        System.out.println("---------------------");
        if (groupOfEquilaterals != null) {
            System.out.printf("Кол-во равносторонних трегольников - %s%n", groupOfEquilaterals.size());
        }
        if (groupOfIsosceles != null) {
            System.out.printf("Кол-во равнобедренных трегольников - %s%n", groupOfIsosceles.size());
        }
        if (groupOfUnequals != null) {
            System.out.printf("Кол-во прямоугольных трегольников - %s%n", groupOfUnequals.size());
        }
    }

    // DO названия методов с глаголом
    // DO убрать ArrayList<Double>, использовать comparable или comparator
    static void maxAndMinSquare(ArrayList<Triangle> groupOfEquilaterals, ArrayList<Triangle> groupOfIsosceles, ArrayList<Triangle> groupOfUnequals) {
        System.out.println("---------------------");
        System.out.println("Группа равносторонние");
        if (!groupOfEquilaterals.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfEquilaterals));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfEquilaterals));
        } else {
            System.out.println("Нет элементов");
        }
        System.out.println("Группа равнобедренные");
        if (!groupOfIsosceles.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfIsosceles));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfIsosceles));
        } else {
            System.out.println("Нет элементов");
        }
        System.out.println("Группа прямоугольные");
        if (!groupOfUnequals.isEmpty()) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(groupOfUnequals));
            System.out.printf("Max perimeter : %s; %n", Collections.max(groupOfUnequals));
        }
    }
}
