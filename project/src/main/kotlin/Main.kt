

// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun printFormattedName(first: String, second: String, format: (String, String) -> String) {
    println(format(first, second))
}

val fancyFormat: (String, String) -> String = { a, b ->
    "first name is $a and last name is $b"
}

fun main() {
    printFormattedName("Vorname", "Nachname") { first, second ->
        "$second, $first"
    }

    printFormattedName("Nate", "Ebel", fancyFormat)
}