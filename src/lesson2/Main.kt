package lesson2

//Var and Val comparison and java example
fun main(args: Array<String>) {

    val userJava = UserJava("dima@gmail.com")

    //Val - immutable variable
    //Var - mutable variable
    val userKotlin = UserKotlin("dimaKt@gmail.com")

    println("Java example: ${userJava.email}")
    println("Kotlin example: ${userKotlin.email}")
}