package lesson12

class Driver(name: String): Person(name) {

    override val age: Int = 2

    override fun getAddress(): String {
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(age=$age, name=$name)"
    }

}