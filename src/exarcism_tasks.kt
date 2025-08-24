// TASK 1
//fun main() {
//    var offer: String
//    val item = "Google Chromecast"
//    val discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println(offer)
//}

// TASK 2
//fun main() {
//    val numberOfAdulnts = 20
//    val numberOfKids = 30
//    val total = numberOfKids + numberOfAdulnts
//    println("The total party size is $total")
//}


// TASK 3
//fun main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = "$baseSalary + $bonusAmount"
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}

// TASK 4
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber + secondNumber
//
//    println("$firstNumber + $secondNumber = $result")
//}


// TASK 5
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = add(firstNumber, secondNumber)
//    val anotherResult = add(firstNumber, thirdNumber)
//
//    println("$firstNumber + $secondNumber = $result")
//    println("$firstNumber + $thirdNumber = $anotherResult")
//}
//
//fun add(first: Int, second: Int): Int = first + second


// TASK 6
//fun main() {
//    val firstUserEmailId = "user_one@gmail.com"
//
//    // The following line of code assumes that you named your parameter as emailId.
//    // If you named it differently, feel free to update the name.
//    println(displayAlertMessage(emailId = firstUserEmailId))
//    println()
//
//    val secondUserOperatingSystem = "Windows"
//    val secondUserEmailId = "user_two@gmail.com"
//
//    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
//    println()
//
//    val thirdUserOperatingSystem = "Mac OS"
//    val thirdUserEmailId = "user_three@gmail.com"
//
//    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
//    println()
//}
//
//fun displayAlertMessage(os: String = "Unknown OS", emailId: String = "Unknown email"): String {
//    return "There's a new sign-in request on $os for your Google Account $emailId."
//}


// TASK 7
//fun main() {
//    val steps = 4000
//    val caloriesBurned = pedometerStepsToCalories(Steps);
//    println("Walking $steps steps burns $caloriesBurned calories")
//}
//
//fun pedometerStepsToCalories(numberOfSteps: Int): Double {
//    val calForSteps = 0.04
//    val totalCaloriesBurned = numberOfSteps * calForSteps
//    return totalCaloriesBurned
//}

// TASK 8
//fun main (){
//    println(timeSpend(300,300))
//}
//
//fun timeSpend(today: Int, yesterday: Int): Boolean {
//    return today > yesterday
//}

// TASK 9
fun main() {
    temperature("Tokyo", 32,36,10)
    temperature("Cape Town", 59,64,2)
}

fun temperature(city: String, lowTemp: Int, highTemp: Int, rain: Int) {
    println(
        """City: $city
           Low Temperature: $lowTemp, High temperature: $highTemp
           Chance of rain: $rain%
        """
    )
}
