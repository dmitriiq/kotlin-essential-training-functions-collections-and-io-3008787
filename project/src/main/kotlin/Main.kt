
private fun printGreeting() = println("Hello Kotlin")

fun main() {
    fun getGreeting(greeting: String = "Hi", thingToGreet: String = "World") = "$greeting $thingToGreet"

    println(getGreeting(thingToGreet = "World", greeting = "Hey there"))
}