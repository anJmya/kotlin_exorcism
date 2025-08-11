fun main() {
    println(birthdayGreeting(age = 54, name = "Anton"))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name"
    val ageGreeting = "You are now $age years old"
    return "$nameGreeting\n$ageGreeting"
}