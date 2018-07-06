package lesson11


/**
 * If we speak about abstract classes and their difference with interfaces, we should say that abstract classes can save
 * and change the state of object. It means, abstract classes can have mutable variable inside it.
 * */
abstract class BaseTemplate {

    var count = 0

    fun a() {
        count++
        println("COUNT: $count")
    }

    abstract fun minus()
}