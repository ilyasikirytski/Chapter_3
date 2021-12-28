package task_classes.b_9;/*
Определить класс Окружность на плоскости. Определить площадь и периметр.
Создать массив/список/множество объектов и определить группы
окружностей, центры которых лежат на одной прямой.
Определить наибольший и наименьший по площади (периметру) объект.
 */

public class Circle {
    int id;
    double radius;
    double x;
    double y;

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
}
