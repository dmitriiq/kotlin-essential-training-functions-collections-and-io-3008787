

fun main() {
    var someVariable = 7

    when {
        someVariable > 3 -> println("The value was greater than 3")
        someVariable > 2 -> println("The value was greater than 2")
        else -> {
            println("Not greater")
        }
    }

    print("-----------------------------------------------\n")

    when (someVariable) {
        0,1 -> println("The value was 0 or 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3")
//        in 4..Int.MAX_VALUE -> println("The value was greater than 3")
        in 5..7 -> println("in 5..7")
    }
}