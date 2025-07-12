
fun main() {
    var aNullableString: String? = null
    println(aNullableString?.length ?: "the value was null")
}