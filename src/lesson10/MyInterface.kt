package lesson10

interface MyInterface {
    /**
     * Interface does not save the state unlike abstract class. But, it can save the properties
     * */

    //Immutable property, that have to be initialized in each interface implementation
    val p1: Int

    //Immutable property, that initialized directly in the interface via getter, and needles to be override in implementations
    val p2: Int
    get() = 1

    fun fun1()

    fun fun2() {
        println("default")
    }
}