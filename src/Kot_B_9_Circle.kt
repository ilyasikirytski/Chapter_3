package task_classes

/*
Определить класс Окружность на плоскости. Определить площадь и периметр.
Создать массив/список/множество объектов и определить группы
окружностей, центры которых лежат на одной прямой.
Определить наибольший и наименьший по площади (периметру) объект.
 */
class Kot_B_9_Circle(var id: Int, var radius: Double, var x: Double, var y: Double) {

    fun findingLength(): Double {
        return 2 * (Math.PI * radius)
    }

    override fun toString(): String {
        return "Окружность = " + findingLength()
    }
}