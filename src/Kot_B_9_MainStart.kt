fun main() {
    val circle = Kot_B_9_Circle(1, 1.0, 0.0, 5.0)
    val circle2 = Kot_B_9_Circle(2, 2.0, 0.0, 4.0)
    val circle3 = Kot_B_9_Circle(3, 3.0, 3.0, 4.0)
    val circle4 = Kot_B_9_Circle(4, 4.0, 3.0, 5.0)
    val circles = arrayOfNulls<Kot_B_9_Circle>(4)
    circles[0] = circle
    circles[1] = circle2
    circles[2] = circle3
    circles[3] = circle4
    val area = ArrayList<Double>()
    area(circles, area)
    circleLength(circles, area)
    onTheSameLine(circles)
    maxAndMinSqrt(area)
}

fun area(circles: Array<Kot_B_9_Circle?>, area: ArrayList<Double>) {
    println("-----------------")
    val PI = Math.PI
    for (circle in circles) {
        val result = PI * (circle!!.radius * circle.radius)
        area.add(result)
        System.out.printf("Площадь окружности №%s равна %s%n", circle.id, result)
    }
}

fun circleLength(circles: Array<Kot_B_9_Circle?>, area: ArrayList<Double>) {
    println("-----------------")
    val PI = Math.PI
    for (circle in circles) {
        val result = 2 * (PI * circle!!.radius)
        area.add(result)
        System.out.printf("Длинна окружности №%s равна %s%n", circle.id, result)
    }
}

fun onTheSameLine(circles: Array<Kot_B_9_Circle?>) {
    println("-----------------")
    for (i in 1 until circles.size) {
        if (circles[i]!!.x == circles[i - 1]!!.x || circles[i]!!.x == circles[i - 1]!!.y) {
            System.out.printf(
                "Окружность №%s c центром в точке [X:%s,Y:%s] лежит на одной прямой с окружностью №%s" +
                        " c центром в точке [X:%s,Y:%s] %n",
                circles[i]!!.id,
                circles[i]!!.x,
                circles[i]!!.y,
                circles[i - 1]!!.id,
                circles[i - 1]!!.x,
                circles[i - 1]!!.y
            )
        }
    }
}

fun maxAndMinSqrt(area: ArrayList<Double>?) {
    println("---------------------")
    println("Группа окружности")
    System.out.printf("Min area : %s; %n", area?.minOrNull())
    System.out.printf("Max area : %s; %n", area?.maxOrNull())
}
