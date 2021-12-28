package task_classes.b_9;

import java.util.ArrayList;
import java.util.Collections;

public class Main_b_9 {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 1, 0, 5);
        Circle circle2 = new Circle(2, 2, 0, 4);
        Circle circle3 = new Circle(3, 3, 3, 4);
        Circle circle4 = new Circle(4, 4, 3, 5);

        Circle[] circles = new Circle[4];
        circles[0] = circle;
        circles[1] = circle2;
        circles[2] = circle3;
        circles[3] = circle4;
        ArrayList<Double> area = new ArrayList<>();

        area(circles, area);
        circleLength(circles, area);
        onTheSameLine(circles);
        maxAndMinSqrt(area);
    }

    static void area(Circle[] circles, ArrayList<Double> area) {
        System.out.println("-----------------");
        final double PI = Math.PI;
        for (Circle circle : circles) {
            double result = PI * (circle.radius * circle.radius);
            area.add(result);
            System.out.printf("Площадь окружности №%s равна %s%n", circle.id, result);
        }
    }

    static void circleLength(Circle[] circles, ArrayList<Double> area) {
        System.out.println("-----------------");
        final double PI = Math.PI;
        for (Circle circle : circles) {
            double result = 2 * (PI * (circle.radius));
            area.add(result);
            System.out.printf("Длинна окружности №%s равна %s%n", circle.id, result);
        }
    }

    static void onTheSameLine(Circle[] circles) {
        System.out.println("-----------------");
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].x == circles[i - 1].x || circles[i].x == circles[i].y) {
                System.out.printf("Окружность №%s c центром в точке [X:%s,Y:%s] лежит на одной прямой с окружностью №%s" +
                        " c центром в точке [X:%s,Y:%s] %n", circles[i].id, circles[i].x, circles[i].y, circles[i].id, circles[i].x, circles[i].y);
            }
        }
    }

    static void maxAndMinSqrt(ArrayList<Double> area) {
        System.out.println("---------------------");
        System.out.println("Группа окружности");
        System.out.printf("Min area : %s; %n", Collections.min(area));
        System.out.printf("Max area : %s; %n", Collections.max(area));
    }
}
