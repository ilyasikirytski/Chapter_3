package task_classes.b_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// DO замечания такие же как в 7-ой задачче
public class Main_b_9 {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
                new Circle(1, 1, 0, 5),
                new Circle(2, 2, 0, 5),
                new Circle(3, 3, 3, 5),
                new Circle(4, 4, 3, 5)
        };

        ArrayList<Circle> area = new ArrayList<>();

        square(circles);
        circleLength(circles);
        groupingOnTheSameLine(circles);
        maxAndMinSqrt(circles);
    }

    static double circleSquare(Circle circle) {
        return Math.PI * (circle.getRadius() * circle.getRadius());
    }

    // DO имя square!
    // DO убрать final double PI = Math.PI;
    static void square(Circle[] circles) {
        System.out.println("-----------------");
        for (Circle c : circles) {
            System.out.printf("Площадь окружности №%s равна %s%n", c.getId(), circleSquare(c));
        }
    }

    static void circleLength(Circle[] circles) {
        System.out.println("-----------------");
        for (Circle c : circles) {
            System.out.printf("Длинна окружности №%s равна %s%n", c.getId(), c.findingLength());
        }
    }

    static void groupingOnTheSameLine(Circle[] circles) {
        System.out.println("-----------------");
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getX() == circles[i - 1].getX() || circles[i].getX() == circles[i - 1].getY()) {
                System.out.printf("Окружность №%s c центром в точке [X:%s,Y:%s] лежит на одной прямой с окружностью №%s" +
                        " c центром в точке [X:%s,Y:%s] %n", circles[i].getId(), circles[i].getX(), circles[i].getY(),
                        circles[i - 1].getId(), circles[i - 1].getX(), circles[i - 1].getY());
            }
        }
    }

    static void maxAndMinSqrt(Circle[] circles) {
        System.out.println("---------------------");
        System.out.println("Группа окружности");
        System.out.printf("Min %s; %n", Collections.min(Arrays.stream(circles).toList()));
        System.out.printf("Max %s; %n", Collections.max(Arrays.stream(circles).toList()));
    }
}
