fun main(args: Array<String>){
    /*
    Задание № 1
     */

    var anyNull: Any? = null
    anyNull = 5
    var number = anyNull/2.5 // получмлась переменная типа Double

    /*
    Задание № 2
     */

    var helloString = "hello"
    var aplanaString = "aplana"
    println(helloString + " " + aplanaString)

    /*
    Задание № 3
     */

    var five: Char = '5'
    var fiveString: String = five.toString()
    var fiveByte: Byte = five.toByte()
    var fiveShort: Short = five.toShort()
    var fiveInt: Int = five.toInt()
    var fiveDouble: Double = five.toDouble()
    var fiveFloat: Float = five.toFloat()
    var fiveLong: Long = five.toLong()

    /*
    Задание № 4
     */

    println("Нипишите ваше имя и нажмите Enter")
    var userName: String? = readLine()
    var stringName: String = userName.toString()
    println("Приветствую $stringName")

    /*
    Задание № 5
     */

    var range= 'z' downTo  'a'

    /*
    Задание № 6
     */

    println("Введите первое число")
    var enteredNumber: String? = readLine()
    var a = enteredNumber?.toInt()
    println("Введите второе число")
    var enteredNumber1: String? = readLine()
    var b = enteredNumber1?.toInt()
    var c = a!! > b!!

}