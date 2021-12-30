package task_classes.b_8;/*
Определить класс Четырехугольник на плоскости. Определить площадь
и периметр четырехугольника. Создать массив/список/множество объектов
и подсчитать количество четырехугольников разного типа (квадрат, прямоугольник, ромб, произвольный). Определить для каждой группы наибольший
и наименьший по площади (периметру) объект.
 */

import java.util.ArrayList;

public class Quadrilateral implements Comparable<Quadrilateral> {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    boolean isQuadLateral() {
        return a == b && b == c && c == d && d == a;
    }

    boolean isRectangle() {
        return a == c && b == d;
    }

    boolean isRhombus() {
        return a + c == b + d;
    }

    boolean groupingOfQuadril(Quadrilateral q, ArrayList<Quadrilateral> groupOfQuadril) {
        boolean x = false;
        if (q.isQuadLateral()) {
            groupOfQuadril.add(q);
            x = true;
        }
        return x;
    }

    boolean groupingOfRectangle(Quadrilateral q, ArrayList<Quadrilateral> groupOfRectangle) {
        boolean x = false;
        if (q.isRectangle()) {
            groupOfRectangle.add(q);
            x = true;
        }
        return x;
    }

    boolean groupingOfRhombus(Quadrilateral q, ArrayList<Quadrilateral> groupOfRhombus) {
        boolean x = false;
        if (q.isRhombus()) {
            groupOfRhombus.add(q);
            x = true;
        }
        return x;
    }

    double perimeter() {
        return (a + b + c + d);
    }

    @Override
    public String toString() {
        return "Четырёхугольник со сторонами {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}' + " - " + perimeter();
    }

    @Override
    public int compareTo(Quadrilateral o) {
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
