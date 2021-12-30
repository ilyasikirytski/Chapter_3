package task_classes

// DO замечания такие же как в 7-ой задачче
fun main() {
    val circles: Array<Kot_B_9_Circle> = arrayOf(
        Kot_B_9_Circle(1, 1.0, 0.0, 5.0),
        Kot_B_9_Circle(2, 2.0, 0.0, 5.0),
        Kot_B_9_Circle(3, 3.0, 3.0, 5.0),
        Kot_B_9_Circle(4, 4.0, 3.0, 5.0)
    )
    square(circles)
    circleLength(circles)
    groupingOnTheSameLine(circles)
    maxAndMinSqrt(circles)
}

fun circleSquare(circle: Kot_B_9_Circle): Double {
    return Math.PI * (circle.radius * circle.radius)
}

fun square(circles: Array<Kot_B_9_Circle>) {
    println("-----------------")
    for (c in circles) {
        System.out.printf("Площадь окружности №%s равна %s%n", c.id, circleSquare(c))
    }
}

fun circleLength(circles: Array<Kot_B_9_Circle>) {
    println("-----------------")
    for (c in circles) {
        System.out.printf("Длинна окружности №%s равна %s%n", c.id, c.findingLength())
    }
}

fun groupingOnTheSameLine(circles: Array<Kot_B_9_Circle>) {
    println("-----------------")
    for (i in 1 until circles.size) {
        if (circles[i].x == circles[i - 1].x || circles[i].x == circles[i - 1].y) {
            println(
                "Окружность ${circles[i].id} " +
                        "c центром в точке [${circles[i].x} | ${circles[i].y}] " +
                        "лежит на одной прямой с окружностью ${circles[i - 1].id} " +
                        "c центром в точке [${circles[i - 1].x} | ${circles[i - 1].y}]",
            )
        }
    }
}

fun maxAndMinSqrt(circles: Array<Kot_B_9_Circle>) {
    println("---------------------")
    println("Группа окружности")
    println("Min ${circles.minOf { it.findingLength() }};")
    println("Max ${circles.maxOf { it.findingLength() }};")
}
