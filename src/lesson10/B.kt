package lesson10

class B : MyInterface {

    override val p1: Int
        get() = 10

    override fun fun1() {
        println("class B")
    }
}