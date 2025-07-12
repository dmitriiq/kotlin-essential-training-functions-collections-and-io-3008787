
var greetingFunction: () -> Unit = {
    println("Hello Kitlin")
}

fun main() {
    greetingFunction()

    greetingFunction = {
        println("Hello World!")
    }

    greetingFunction.invoke()
}