package lesson14

fun main(args: Array<String>) {
    var index: Int = 0

//    while (index < 10) {
//        println("Yo :)")
//        index++
//    }

//    do {
//        println("Yo :)")
//        index++
//    } while (index < 10)

    var nums = 1..10 //range from 1 to 10

//    for (value in nums) {
//        print("$value ")
//    }

    for (value in nums step 2) {
        print("$value ")
    }

    println()

    for (value in 10 downTo 1) {
        print("$value ")
    }

    println()
    
    for (value in 10 downTo 5 step 2) {
        print("$value ")
    }
}