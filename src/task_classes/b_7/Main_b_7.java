package task_classes.b_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Math.sqrt;

public class Main_b_7 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1, 1);
        Triangle triangle2 = new Triangle(2, 2, 2);
        Triangle triangle3 = new Triangle(3, 3.55, 3.45);
        Triangle triangle4 = new Triangle(4, 4.55, 4.45);

        Triangle[] triangles = new Triangle[4];
        triangles[0] = triangle;
        triangles[1] = triangle2;
        triangles[2] = triangle3;
        triangles[3] = triangle4;
        ArrayList<Triangle> equilateral = new ArrayList<>();
        ArrayList<Triangle> isosceles = new ArrayList<>();
        ArrayList<Triangle> unequal = new ArrayList<>();
        ArrayList<Double> equilateralDouble = new ArrayList<>();
        ArrayList<Double> isoscelesDouble = new ArrayList<>();
        ArrayList<Double> unequalDouble = new ArrayList<>();
        Double[] perimeter = new Double[triangles.length];

        squareHeron(triangles);
        perimeter(triangles, perimeter);
        groupOfTriangle(triangles, equilateralDouble, isoscelesDouble, unequalDouble, equilateral, isosceles, unequal);
        numberOfGroupOfTriangles(equilateral, isosceles, unequal);
        maxAndMinSqrt(equilateralDouble, isoscelesDouble, unequalDouble);
    }

    // TODO названия методов с глаголом
    // TODO площадь в отдельный метод, лучше в Triangle
    static void squareHeron(Triangle[] triangles) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            double p = (triangles[i].a + triangles[i].b + triangles[i].c) / 2;
            double square = sqrt(p * (p - triangles[i].a) * (p - triangles[i].b) * (p - triangles[i].c));
            System.out.printf("Площадь треугольника номер: %s равна: %s%n", i, square);
        }
    }

    // TODO названия методов с глаголом
    static void perimeter(Triangle[] triangles, Double[] perimeter) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            double perim = triangles[i].a + triangles[i].b + triangles[i].c;
            perimeter[i] = perim;
            System.out.printf("Периметр треугольника номер: %s равен: %s%n", i, perimeter[i]);
        }
    }

    // TODO названия методов с глаголом
    // TODO периметр в отдельный метод, лучше в Triangle
    // TODO вывод на экран и группировку разделить на 2 метода
    // TODO вынести определение типа треугольника в отдельный метод
    static void groupOfTriangle(Triangle[] triangles, ArrayList<Double> equilateralDouble, ArrayList<Double> isoscelesDouble, ArrayList<Double> unequalDouble, ArrayList<Triangle> equilateral, ArrayList<Triangle> isosceles, ArrayList<Triangle> unequal) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].a == triangles[i].b && triangles[i].b == triangles[i].c) {
                equilateral.add(triangles[i]);
                equilateralDouble.add(triangles[i].a + triangles[i].b + triangles[i].c);
                System.out.printf("Треугольник № %s - Равносторонний %n", i);
            } else if (triangles[i].a == triangles[i].b || triangles[i].b == triangles[i].c || triangles[i].c == triangles[i].a) {
                isosceles.add(triangles[i]);
                isoscelesDouble.add(triangles[i].a + triangles[i].b + triangles[i].c);
                System.out.printf("Треугольник № %s - Равнобедренный %n", i);
            } else if (triangles[i].a != triangles[i].b || triangles[i].b != triangles[i].c || triangles[i].c != triangles[i].a) {
                unequal.add(triangles[i]);
                unequalDouble.add(triangles[i].a + triangles[i].b + triangles[i].c);
                System.out.printf("Треугольник № %s - Прямоугольный %n", i);
            }
        }
    }

    // TODO названия методов с глаголом
    static void numberOfGroupOfTriangles(ArrayList<Triangle> equilateral, ArrayList<Triangle> isosceles, ArrayList<Triangle> unequal) {
        System.out.println("---------------------");
        if (equilateral != null) {
            System.out.printf("Кол-во равнобедренных трегольников - %s%n", isosceles.size());
        }
        if (isosceles != null) {
            System.out.printf("Кол-во равносторонних трегольников - %s%n", equilateral.size());
        }
        if (unequal != null) {
            System.out.printf("Кол-во прямоугольных трегольников - %s%n", unequal.size());
        }
    }

    // TODO названия методов с глаголом
    // TODO убрать ArrayList<Double>, использовать comparable или comparator
    static void maxAndMinSqrt(ArrayList<Double> equilateralDouble, ArrayList<Double> isoscelesDouble, ArrayList<Double> unequalDouble) {
        System.out.println("---------------------");
        System.out.println("Группа равносторонние");
        for (int i = 1; i < equilateralDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(equilateralDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(equilateralDouble));
        }
        System.out.println("Группа равнобедренные");
        for (int i = 1; i < isoscelesDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(isoscelesDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(isoscelesDouble));
        }
        System.out.println("Группа прямоугольные");
        for (int i = 1; i < unequalDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(unequalDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(unequalDouble));
        }
    }
}
