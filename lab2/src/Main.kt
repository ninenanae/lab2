fun main()
{
    println("ЗАДАНИЕ 1")
    println("Введите двухзначное число:")
    val number = readLine()!!.toInt()
    val tens = number / 10
    val units = number % 10
    val sumDigits = tens + units
    val productDigits = tens * units
    println("Число десятков: $tens")
    println("Число единиц: $units")
    println("Сумма цифр: $sumDigits")
    println("Произведение цифр: $productDigits")

    println("\nЗАДАНИЕ 2")
    println("Введите трёхзначное число:")
    val number0 = readLine()!!.toInt()
    val units0 = number0 % 10
    val tens0 = (number0 / 10) % 10
    val hundreds0 = number0 / 100
    val sumDigits0 = hundreds0 + tens0 + units0
    val productDigits0 = hundreds0 * tens0 * units0
    println("Число единиц: $units0")
    println("Число десятков: $tens0")
    println("Сумма цифр: $sumDigits0")
    println("Произведение цифр: $productDigits0")

    println("\nЗАДАНИЕ 3")
    print("Введите делимое: ")
    val делимое = readLine()!!.toDouble()
    print("Введите делитель: ")
    val делитель = readLine()!!.toDouble()
    val результат = делимое / делитель
    println("$делимое / $делитель = $результат")

    println("\nЗАДАНИЕ 4")
    print("Введите число: ")
    val число = readLine()!!.toDouble()
    print("Введите степень: ")
    val степень = readLine()!!.toInt()
    val результат0 = Math.pow(число, степень.toDouble())
    println("$число в степени $степень равно: $результат0")

    println("\nЗАДАНИЕ 5")
    print("Введите число: ")
    val число0 = readLine()!!.toDouble()
    val корень = Math.sqrt(число0)
    println("Квадратный корень из $число0 равен: $корень")

    println("\nЛОГИЧЕСКИЕ ВЫРАЖЕНИЯ")

    println("\nЗАДАНИЕ 1")
    val a = true
    val b = false
    val c = false
    val resultA = a || b
    println("a) А или В: $resultA")
    val resultB = a && b
    println("b) А и В: $resultB")
    val resultC = b || c
    println("c) В или С: $resultC")

    println("\nЗАДАНИЕ 2")
    val x = false
    val y = true
    val z = false
    val resultA0 = x || z
    println("a) X или Z: $resultA0")
    val resultB0 = x && y
    println("b) X и Y: $resultB0")
    val resultC0 = x && z
    println("c) X и Z: $resultC0")

    println("\nЗАДАНИЕ 3")
    val a0 = true
    val b0 = false
    val c0 = false
    val resultA1 = !a0 && b0
    println("a) не А и В: $resultA1")
    val resultB1 = a0 || !b0
    println("b) А или не В: $resultB1")
    val resultC1 = a0 && b0 || c0
    println("c) А и В или С: $resultC1")

    println("\nЗАДАНИЕ 4")
    val x0 = true
    val y0 = true
    val z0 = false
    val resultA2 = !x0 && y0
    println("a) не X и Y: $resultA2")
    val resultB2 = x0 || !y0
    println("b) X или не Y: $resultB2")
    val resultC2 = x0 || (y0 && z0)
    println("c) X или Y и Z: $resultC2")

    println("\nЗАДАНИЕ 5")
    val x1 = true
    val y1 = true
    val z1 = false
    val resultA3 = !x1 && y1
    println("a) не X и Y: $resultA3")
    val resultB3 = x1 || !y1
    println("b) X или не Y: $resultB3")
    val resultC3 = x1 || (y1 && z1)
    println("c) X или Y и Z: $resultC3")

    println("\nЗАДАНИЕ 6")
    val x2 = false
    val y2 = false
    val z2 = true
    val resultA4 = x || (y2 && !z2)
    println("a) X или Y и не Z: $resultA4")
    val resultB4 = !x2 && !y2
    println("b) не X и не Y: $resultB4")
    val resultC4 = !(x2 && z2) || y2
    println("c) не (X и Z) или Y: $resultC4")
    val resultD4 = x2 && !y2 || z2
    println("d) X и не Y или Z: $resultD4")
    val resultE4 = x2 && (!y2 || z2)
    println("e) X и (не Y или Z): $resultE4")
    val resultF4 = x2 || !(y2 || z2)
    println("f) X или (не (Y или Z)): $resultF4")

    println("\nЗАДАНИЕ 7")
    val a1 = true
    val b1 = false
    val c1 = false
    val resultA5 = a1 || !(a1 && b1) || c1
    println("a) А или не (А и В) или С: $resultA5")
    val resultB5 = !a1 || (a1 && (b1 || c1))
    println("b) не А или А и (В или С): $resultB5")
    val resultC5 = (a1 || (b1 && !c1)) && c1
    println("c) (А или В и не С) и С: $resultC5")





}