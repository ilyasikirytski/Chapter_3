package task_classes.b_7;

import java.util.ArrayList;

/*
Определить класс Треугольник на плоскости.
Определить площадь и периметр треугольника.
Создать массив/список/множество объектов и подсчитать количество
треугольников разного типа (равносторонний, равнобедренный, прямоугольный, произвольный).
Определить для каждой группы наибольший и наименьший по площади (периметру) объект
 */
public class Triangle implements Comparable<Triangle> {
    private double a;
    private double b;
    private double c;

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

    public double getB() {
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

    boolean isEquilateral() {
        return a == b && b == c;
    }

    boolean isIsosceles() {
        return a == b || b == c || c == a;
    }

    boolean isUnequals() {
        return a + b == c || b + c == a;
    }

    boolean isNonExistent() {
        return a + b < c || a + c < b || b + c < a;
    }

    boolean groupingOfEquilaterals(Triangle triangles, ArrayList<Triangle> groupOfEquilaterals) {
        boolean x = false;
        if (triangles.isEquilateral()) {
            groupOfEquilaterals.add(triangles);
            x = true;
        }
        return x;
    }

    boolean groupingOfIsosceles(Triangle triangles, ArrayList<Triangle> groupOfIsosceles) {
        boolean x = false;
        if (triangles.isIsosceles()) {
            groupOfIsosceles.add(triangles);
            x = true;
        }
        return x;
    }

    boolean groupingOfUnequals(Triangle triangles, ArrayList<Triangle> groupOfUnequals) {
        boolean x = false;
        if (triangles.isUnequals()) {
            groupOfUnequals.add(triangles);
            x = true;
        }
        return x;
    }

    double perimeter() {
        return (a + b + c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + " - " + perimeter();
    }

    @Override
    public int compareTo(Triangle o) {
        double firstPerimeter = perimeter();
        double secondPerimeter = o.perimeter();
        if (firstPerimeter > secondPerimeter) {
            return 1;
        } else if (firstPerimeter == secondPerimeter) {
            return 0;
        } else if (firstPerimeter < secondPerimeter) {
            return -1;
        } else return 2;
    }
}

