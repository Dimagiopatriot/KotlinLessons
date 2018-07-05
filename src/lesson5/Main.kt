package lesson5

//NPE, Null safety
fun main(args: Array<String>) {

    val st: String

    //we can`t initialize as null variable
    //st = null

    //ok, for null possibility we do this
    val st1: String? = getSt()
    //then you put double question mark after calling function on this object (because it can be null and create NPE)
    val size = st1!!.length

    println(size)
}

// but you can do like this
fun getSt(): String? {
    return "hello"
}