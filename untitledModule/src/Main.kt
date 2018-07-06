import lesson13.SuperMouse

fun main(args: Array<String>) {

    //IT WON`T COMPILE, because SuperMouse class has internal access modifier, which make visible this class just inside
    //module where this class is staying
    var superMouse = SuperMouse()
}