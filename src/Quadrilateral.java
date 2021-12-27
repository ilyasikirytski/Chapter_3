/*
Определить класс Четырехугольник на плоскости. Определить площадь
и периметр четырехугольника. Создать массив/список/множество объектов
и подсчитать количество четырехугольников разного типа (квадрат, прямоугольник, ромб, произвольный). Определить для каждой группы наибольший
и наименьший по площади (периметру) объект.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Quadrilateral {
    double a;
    double b;
    double c;
    double d;

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

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(1, 1, 1, 1);
        Quadrilateral quadrilateral2 = new Quadrilateral(2, 2, 2, 2);
        Quadrilateral quadrilateral3 = new Quadrilateral(3, 3, 4, 4);
        Quadrilateral quadrilateral4 = new Quadrilateral(4, 4, 5, 5);

        Quadrilateral[] quadrilaterals = new Quadrilateral[4];
        quadrilaterals[0] = quadrilateral;
        quadrilaterals[1] = quadrilateral2;
        quadrilaterals[2] = quadrilateral3;
        quadrilaterals[3] = quadrilateral4;
        ArrayList<Quadrilateral> quadril = new ArrayList<>();
        ArrayList<Quadrilateral> rectangle = new ArrayList<>();
        ArrayList<Quadrilateral> rhombus = new ArrayList<>();
        ArrayList<Double> quadrilDouble = new ArrayList<>();
        ArrayList<Double> rectangleDouble = new ArrayList<>();
        ArrayList<Double> rhombusDouble = new ArrayList<>();
        ArrayList<Double> perimeter = new ArrayList<>();

        square(quadrilaterals, quadril, rectangle, rhombus);
        perimeter(quadrilaterals, perimeter);
        groupOfTriangle(quadrilaterals, quadrilDouble, rectangleDouble, rhombusDouble, quadril, rectangle, rhombus);
        numberOfGroupOfTriangles(quadril, rectangle, rhombus);
        maxAndMinSqrt(quadrilDouble, rectangleDouble, rhombusDouble);
    }

    static void square(Quadrilateral[] quadrilaterals, ArrayList<Quadrilateral> quadril, ArrayList<Quadrilateral> rectangle, ArrayList<Quadrilateral> rhombus) {
        System.out.println("---------------------");
        for (int i = 0; i < quadrilaterals.length; i++) {
            if (quadrilaterals[i].a == quadrilaterals[i].b && quadrilaterals[i].b == quadrilaterals[i].c && quadrilaterals[i].c == quadrilaterals[i].d && quadrilaterals[i].d == quadrilaterals[i].a) {
                double area = quadrilaterals[i].a * quadrilaterals[i].b;
                System.out.printf("Четырёхугольник № %s - Квадрат; Площадь = %s%n", i, area);
            } else if (quadrilaterals[i].a == quadrilaterals[i].c && quadrilaterals[i].b == quadrilaterals[i].d) {
                double area = quadrilaterals[i].a * quadrilaterals[i].b;
                System.out.printf("Четырёхугольник № %s - Прямоугольник; Площадь = %s %n", i, area);
            } else if (quadrilaterals[i].a + quadrilaterals[i].c == quadrilaterals[i].b + quadrilaterals[i].d) {
                double area = ((quadrilaterals[i].a * quadrilaterals[i].c) * (quadrilaterals[i].b * quadrilaterals[i].d)) / 2;
                System.out.printf("Четырёхугольник № %s - Ромб; Площадь = %s %n", i, area);
            }
        }
    }

    // S = (AC · BD) / 2 area rhombus
    static void perimeter(Quadrilateral[] quadrilaterals, ArrayList<Double> perimeter) {
        System.out.println("---------------------");
        for (int i = 0; i < quadrilaterals.length; i++) {
            double perim = quadrilaterals[i].a + quadrilaterals[i].b + quadrilaterals[i].c + quadrilaterals[i].d;
            perimeter.add(perim);
            System.out.printf("Периметр четырёхугольника номер: %s равен: %s%n", i, perimeter.get(i));
        }
    }

    static void groupOfTriangle(Quadrilateral[] quadrilaterals, ArrayList<Double> quadrilDouble, ArrayList<Double> rectangleDouble, ArrayList<Double> rhombusDouble, ArrayList<Quadrilateral> quadril, ArrayList<Quadrilateral> rectangle, ArrayList<Quadrilateral> rhombus) {
        System.out.println("---------------------");
        for (int i = 0; i < quadrilaterals.length; i++) {
            if (quadrilaterals[i].a == quadrilaterals[i].b && quadrilaterals[i].b == quadrilaterals[i].c && quadrilaterals[i].c == quadrilaterals[i].d && quadrilaterals[i].d == quadrilaterals[i].a) {
                quadril.add(quadrilaterals[i]);
                quadrilDouble.add(quadrilaterals[i].a + quadrilaterals[i].b + quadrilaterals[i].c + quadrilaterals[i].d);
                System.out.printf("Четырёхугольник № %s - Квадрат %n", i);
            } else if (quadrilaterals[i].a == quadrilaterals[i].c && quadrilaterals[i].b == quadrilaterals[i].d) {
                rectangle.add(quadrilaterals[i]);
                rectangleDouble.add(quadrilaterals[i].a + quadrilaterals[i].b + quadrilaterals[i].c + quadrilaterals[i].d);
                System.out.printf("Четырёхугольник № %s - Прямоугольник %n", i);
            } else if (quadrilaterals[i].a + quadrilaterals[i].c == quadrilaterals[i].b + quadrilaterals[i].d) {
                rhombus.add(quadrilaterals[i]);
                rhombusDouble.add(quadrilaterals[i].a + quadrilaterals[i].b + quadrilaterals[i].c + quadrilaterals[i].d);
                System.out.printf("Четырёхугольник № %s - Ромб %n", i);
            }
        }
    }

    static void numberOfGroupOfTriangles(ArrayList<Quadrilateral> quadril, ArrayList<Quadrilateral> rectangle, ArrayList<Quadrilateral> rhombus) {
        System.out.println("---------------------");
        if (quadril != null) {
            System.out.printf("Кол-во квадратов - %s%n", quadril.size());
        }
        if (rectangle != null) {
            System.out.printf("Кол-во прямоугольников - %s%n", rectangle.size());
        }
        if (rhombus != null) {
            System.out.printf("Кол-во ромбов - %s%n", rhombus.size());
        }
    }

    // создать
    static void maxAndMinSqrt(ArrayList<Double> quadrilDouble, ArrayList<Double> rectangleDouble, ArrayList<Double> rhombusDouble) {
        System.out.println("---------------------");
        System.out.println("Группа квадраты");
        for (int i = 1; i < quadrilDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(quadrilDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(quadrilDouble));
        }
        System.out.println("Группа прямоугольники");
        for (int i = 1; i < rectangleDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(rectangleDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(rectangleDouble));
        }
        System.out.println("Группа ромбы");
        for (int i = 1; i < rhombusDouble.size(); i++) {
            System.out.printf("Min perimeter : %s; %n", Collections.min(rhombusDouble));
            System.out.printf("Max perimeter : %s; %n", Collections.max(rhombusDouble));
        }
    }
}
