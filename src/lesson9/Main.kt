package lesson9

import lesson9.Color.*

fun main(args: Array<String>) {

    //here a set of methods which demonstrate power of operator 'when' with parameter.
    //In this case, it works like a 'switch-case' in Java
    println(getFavoriteColor(WHITE))
    println(getMultipleCaseFavoriteColor(RED))

    println(getSetOfFavoriteColor(setOf(BLACK, WHITE)))
    println(getSetOfFavoriteColor(setOf(RED, WHITE)))

    var a = 6
    var b = 6
    //Operator 'when' without parameter for multiple 'if' cases
    when {
        (a > b) -> println(" $a > $b == true")
        (a < b) -> println(" $a < $b == true")
        (a == b) -> println(" $a == $b == true")
        else -> println("else")
    }

    //The same logic, but here we use just ordinary 'if'
    if (a > b) {
        println(" $a > $b == true")
    }
    if (a < b) {
        println(" $a < $b == true")
    }
    if (a == b) {
        println(" $a == $b == true")
    }
}

fun getFavoriteColor(color: Color) = when (color) {
    BLACK -> "Black"
    WHITE -> "White"
    RED -> "Red"
    GREEN -> "Green"
}

fun getMultipleCaseFavoriteColor(color: Color) = when (color) {
    BLACK, WHITE -> "Black-White"
    RED, GREEN -> "Red-Green"
}

fun getSetOfFavoriteColor(setOfColors: Set<Color>) = when (setOfColors) {
    setOf(BLACK, WHITE) -> "Black-White"
    setOf(RED, GREEN) -> "Red-Green"
    else -> "No set of colors"
}