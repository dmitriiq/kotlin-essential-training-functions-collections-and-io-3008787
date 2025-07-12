
fun printCalcVal(val1: Int, val2: Int, calc: (Int, Int) -> Int) {
    println("The value is: ${calc(val1, val2)}")
}

fun main() {
    printCalcVal(2, 1) { value1, value2 ->
        value1 + value2
    }

    printCalcVal(2, 1, { value1, value2 ->
        value1 - value2
    })
}