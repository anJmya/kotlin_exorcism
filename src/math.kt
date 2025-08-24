fun main() {
    println("Please enter a number")
    val input = readln()
    val inputAsInteger = try {
        input.toInt()
    } catch(_: NumberFormatException) {
        0
    }

    val output = when(inputAsInteger) {
        3 -> "The number is three"
        5 -> "The number is five"
        in 4..40 -> "The number is between 4 and 40"
        else -> "I have no idea what to print"
    }
    println(output)
}