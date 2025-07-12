

fun main() {
    val message = try {
//        throw IllegalStateException()
        "The value is ${10 / 0}"
//    } catch (error: Throwable) {
//        "Error Throwable $error"
    } catch (error: ArithmeticException) {
        "Error ArithmeticException '$error' was thrown"
    } catch (error: java.lang.IllegalStateException) {
        "Error was IllegalState"
    }
    println(message)
}