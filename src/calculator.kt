import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Input an operand(+,-,*,/):")
    val operand = read.next()

    println("Input first value:")
    val num1 = read.nextInt()

    println("Input second value:")
    val num2 = read.nextInt()

    when (operand){
        "+" -> println("Result is ${num1 + num2}")
        "-" -> println("Result is ${num1 - num2}")
        "*" -> println("Result is ${num1 * num2}")
        "/" -> {
            if (num2 != 0){
                println("Result is ${num1 / num2}")
            }
            else{
                println("Math Error")
            }
        }

        else -> println("Input a valid operand!")
    }


}