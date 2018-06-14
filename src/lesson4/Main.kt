package lesson4

//Functions
fun main(args: Array<String>) {

    myFirstFunction()
    myFirstFunction2(2)
    val result = myFirstFunction4(5, 1.5)

    println(result)
}

fun myFirstFunction(): Int {

    return 1;
}

fun myFirstFunction2(a: Long): Int {

    return a.toInt()
}

fun myFirstFunction3() {

}

//vot eto - zhir!!!
fun myFirstFunction4(a: Long, b: Double) = a + b