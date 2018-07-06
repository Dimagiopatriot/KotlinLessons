package lesson15

fun main(args: Array<String>) {
    val nums = 1..10

    val characters = 'a'..'z'

    val value = 7
    println(value in nums)

    println(isChar('i', characters))
}

fun isChar(character: Char, characters: CharRange): Boolean = character in characters