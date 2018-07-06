package lesson12

fun main(args: Array<String>) {

    val person = Person("Alex")
    val driver = Driver("Alex")

    println(person)
    println(driver)

    println(person.getAddress())
    println(driver.getAddress())
}