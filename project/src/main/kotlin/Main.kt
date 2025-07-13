// Refactor getOutput() to use a when expression

fun getOutput(input: Any?): String = when (input) {
    is Number -> when (input) {
        is Int -> "Input was Int"
        else -> "Input was a non-Int Number"
    }
    is String -> "Input was a String with length ${input.length}"
    null -> "Input was null"
    else -> "input didn't match target input"
}

fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
    println(getOutput('a'))
}