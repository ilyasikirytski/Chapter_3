package task_classes.b_9;/*
Определить класс Окружность на плоскости. Определить площадь и периметр.
Создать массив/список/множество объектов и определить группы
окружностей, центры которых лежат на одной прямой.
Определить наибольший и наименьший по площади (периметру) объект.
 */

import task_classes.b_7.Triangle;

public class Circle implements Comparable<Circle>{
    private int id;
    private double radius;
    private double x;
    private double y;

    public Circle(int id, double radius, double x, double y) {
        this.id = id;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double findingLength(){
        return 2 * (Math.PI * (radius));
    }

//    static boolean onTheSameLine(Circle circles) {
//        boolean x = false;
//        if (circles[i].getX() == circles[i - 1].getX() || circles[i].getX() == circles[i - 1].getY()) {
//            x = true;
//        }
//        return x;
//    }


    @Override
    public String toString() {
        return "Окружность = " + findingLength();
    }

    @Override
    public int compareTo(Circle c) {
        double firstLength = findingLength();
        double secondLength = c.findingLength();
        if (firstLength > secondLength) {
            return 1;
        } else if (firstLength == secondLength) {
            return 0;
        } else if (firstLength < secondLength) {
            return -1;
        } else return 2;
    }
}
