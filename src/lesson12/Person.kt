package lesson12

open class Person(val name: String) {

    open val age: Int = 0

    open fun getAddress(): String {
        return "Test"
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}