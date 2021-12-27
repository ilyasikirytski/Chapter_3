import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.sqrt;

/*
Определить класс Треугольник на плоскости.
Определить площадь и периметр треугольника.
Создать массив/список/множество объектов и подсчитать количество
треугольников разного типа (равносторонний, равнобедренный, прямоугольный, произвольный).
Определить для каждой группы наибольший и наименьший по площади (периметру) объект
 */
public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getD() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

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
        Double[] perimeter = new Double[triangles.length];

        squareHeron(triangles);
        perimeter(triangles, perimeter);
        groupOfTriangle(triangles, equilateral, isosceles, unequal);
        numberOfGroupOfTriangles(equilateral, isosceles, unequal);
        maxAndMinSqrt(perimeter, equilateral, isosceles, unequal);
    }

    static void squareHeron(Triangle[] triangles) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            double p = (triangles[i].a + triangles[i].b + triangles[i].c) / 2;
            double square = sqrt(p * (p - triangles[i].a) * (p - triangles[i].b) * (p - triangles[i].c));
            System.out.printf("Площадь треугольника номер: %s равна: %s%n", i, square);
        }
    }

    static void perimeter(Triangle[] triangles, Double[] perimeter) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            double perim = triangles[i].a + triangles[i].b + triangles[i].c;
            perimeter[i] = perim;
            System.out.printf("Периметр треугольника номер: %s равен: %s%n", i, perimeter[i]);
        }
    }

    static void groupOfTriangle(Triangle[] triangles, ArrayList<Triangle> equilateral, ArrayList<Triangle> isosceles, ArrayList<Triangle> unequal) {
        System.out.println("---------------------");
        for (int i = 0; i < triangles.length; i++) {
            if (triangles[i].a == triangles[i].b && triangles[i].b == triangles[i].c) {
                equilateral.add(triangles[i]);
                System.out.printf("Треугольник № %s - Равносторонний %n", i);
            } else if (triangles[i].a == triangles[i].b || triangles[i].b == triangles[i].c || triangles[i].c == triangles[i].a) {
                isosceles.add(triangles[i]);
                System.out.printf("Треугольник № %s - Равнобедренный %n", i);
            } else if (triangles[i].a != triangles[i].b || triangles[i].b != triangles[i].c || triangles[i].c != triangles[i].a) {
                unequal.add(triangles[i]);
                System.out.printf("Треугольник № %s - Прямоугольный %n", i);
            }
        }
    }

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

    static void maxAndMinSqrt(Double[] perimeter, ArrayList<Triangle> equilateral, ArrayList<Triangle> isosceles, ArrayList<Triangle> unequal) {
        System.out.println("---------------------");
        System.out.println("Группа равносторонние");
        for (int i = 1; i < equilateral.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", perimeter[i - 1]);
            System.out.printf("Max perimeter : %s; %n", perimeter[i]);
        }
        System.out.println("Группа равнобедренные");
        for (int i = 1; i < isosceles.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", perimeter[i - 1]);
            System.out.printf("Max perimeter : %s; %n", perimeter[i]);
        }
        System.out.println("Группа прямоугольные");
        for (int i = 1; i < unequal.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", perimeter[i - 1]);
            System.out.printf("Max perimeter : %s; %n", perimeter[i]);
        }
    }
}

