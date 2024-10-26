import kotlin.math.sqrt

class Point(val x: Int, val y: Int) {
    fun distance(p: Point): Double {
        val dx = p.x - x
        val dy = p.y - y
        return sqrt((dx * dx + dy * dy).toDouble())
    }
}

fun main() {
    print("Введите координаты первой точки (x y): ")
    val input1 = readLine()!!.split(" ")
    if (input1.size != 2) {
        println("Некорректный ввод. Должно быть 2 числа.")
        return
    }
    // Проверка ввода координат на корректность (только цифры и минусы)
    for (i in input1.indices) {
        if (!input1[i].matches(Regex("^-?\\d+$"))) {
            println("Некорректный ввод. Разрешены только цифры и минусы.")
            return
        }
    }
    val x1 = input1[0].toInt()
    val y1 = input1[1].toInt()
    val point1 = Point(x1, y1)

    print("Введите координаты второй точки (x y): ")
    val input2 = readLine()!!.split(" ")
    if (input2.size != 2) {
        println("Некорректный ввод. Должно быть 2 числа.")
        return
    }
    // Проверка ввода координат на корректность (только цифры и минусы)
    for (i in input2.indices) {
        if (!input2[i].matches(Regex("^-?\\d+$"))) {
            println("Некорректный ввод. Разрешены только цифры и минусы.")
            return
        }
    }
    val x2 = input2[0].toInt()
    val y2 = input2[1].toInt()
    val point2 = Point(x2, y2)

    val distance = point1.distance(point2)

    println("Расстояние между точками: $distance")
}
