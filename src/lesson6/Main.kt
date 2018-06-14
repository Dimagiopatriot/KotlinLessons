package lesson6

//Classes and its properties
fun main(args: Array<String>) {
    val person = Person("Dima", "Smishnyi", 21)

    val car = Car(0.5, 10)

    println(person.firstName)
    println(person.lastName)
    println(person.age)

    println(car.isNew)

    car.isNew = true

}