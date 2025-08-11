fun main(){
    var day = readlnOrNull() ?: "Monday"
    day = day.lowercase()
    val dayNum : Int

    when (day) {
        "monday" -> dayNum = 1
        "tuesday" -> dayNum = 2
        "wednesday" -> dayNum = 3
        "thursday" -> dayNum = 4
        "friday" -> dayNum = 5
        "saturday" -> dayNum = -1
        "sunday" -> dayNum = -1
        else -> dayNum = 0
    }

    println(
        when (dayNum) {
            -1 -> "This is not a work day"
            0 -> "This is not a day"
            else -> "Work day number $dayNum"
        }
    )
}