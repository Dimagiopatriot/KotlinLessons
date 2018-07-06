package lesson11

fun main(args: Array<String>) {

    var v1: BaseTemplate = ATemplate()

    //count = 0
    v1.a() //count++: count = 1
    v1.minus() //count--: count = 0
    v1.a() //count++: count = 1
}