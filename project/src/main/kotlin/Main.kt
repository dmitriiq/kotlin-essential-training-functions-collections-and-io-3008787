fun checkType(input: Any?) {
    println(input)
    when (input) {
        null -> println("Input was null")
        is String -> println("Input was a String of length ${input.length}")
    }

    if (input is Long)
        println("long")

    if (input is Int)
        println("int ")
}

fun main() {
    val aGenericVariable: Any = 5

    checkType("null")
    checkType(aGenericVariable)
    checkType(null)
}