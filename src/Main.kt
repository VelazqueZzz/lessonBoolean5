//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provision = readln().toInt()

    print("Благоприятна ли погода (true/false): ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (!hasDamage && crew in 55..70 && provision > 50 && (isWeatherGood || !isWeatherGood))
            || (hasDamage && crew == 70 && isWeatherGood && provision >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}