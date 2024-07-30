import java.util.Scanner

fun main() {
    var letter = Scanner(System.`in`)

    println("Enter a letter: ")
    var alphabet = readln()


        if (alphabet in listOf('a','e','i','o','u')) {
            println("$letter is a vowel")
        }

        else
        {
            println("$letter is a consonant")
        }
}


