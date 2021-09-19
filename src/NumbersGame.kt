fun main() {
    val goal = 8
    print("Guss a number between 0 and 10: ")
    try {
        val input_number = readLine()!!.toInt()
        if (input_number >= 0 && input_number <= 10){
            if (input_number == goal){
                println("You got it!")
            } else {
                print("Wrong guss. The answer was $goal.\n")
            }
        } else {
            println("Please enter number between 0 and 10")
        }
    } catch (e: Exception){
        println("Please enter numbers only")
    }
    println("Game Over")
}