
var greetingFunction: (String) -> String = {
    println("Hello $it")
    it
}

fun main() {
    println(greetingFunction("Kotlin"))
    greetingFunction("Wold")

    greetingFunction = { thingToReturn ->
        "Hello $thingToReturn!"
    }

    println(greetingFunction.invoke("there"))
}