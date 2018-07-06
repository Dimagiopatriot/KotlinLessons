package lesson13

internal class SuperMouse : Mouse(){

    fun funB() {
        println("Super text")
        funA()
    }
}