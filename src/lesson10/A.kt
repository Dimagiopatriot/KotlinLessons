package lesson10

class A : MyInterface {

    override val p1: Int
        get() = 9


    override fun fun1() {
        println("class A")
    }

    override fun fun2() {
        super.fun2()
    }
}