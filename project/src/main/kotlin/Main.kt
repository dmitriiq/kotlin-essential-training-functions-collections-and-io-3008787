
fun main() {
    val languages = listOf("kotlin", "c++", "java").asSequence()

    languages.filter{ it.length > 4 }
        .map{ it.length }
        .forEach { println(it) }
}
