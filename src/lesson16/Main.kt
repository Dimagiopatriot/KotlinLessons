package lesson16

fun main (array: Array<String>) {

    val person = Person("Alex", 24)

    val person2 = person.copy(age = 1)

    person.age = 12

    //Example of components retrieving from a whole data class
    val (name, age) = person

    println(person)
    println(person2)
    print("My age = $age and my name = $name")
}