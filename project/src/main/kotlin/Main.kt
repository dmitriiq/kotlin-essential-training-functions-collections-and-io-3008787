
fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores

    val l = testScores
        .map{ it.value }
        .sorted()
        .take(3)
//        .forEach { println(it) }
        .forEach { score ->
            testScores.forEach {
            if ( it.value == score ) {
                println ( "key ${it.key} val ${it.value}" )
            }
        } }

    println("------------------------------------------------------------------------------------------------------")

    testScores.
        toList()
        .sortedBy { it.second }
        .take(3)
        .forEach { println("id ${it.first}, score ${it.second}") }

}