fun main() {

    var firstname = "Thierry"
    var lastname = "Henry"

    println(firstname)

    //Accessing an element in a string.
    println(firstname[1])

    //Modifying an element in a string.
    println(lastname.uppercase())
    println(firstname.lowercase())

    //String concatenation - Joining strings
    println(firstname + lastname)
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //String Interpolation
    println("My first name is" + " " + firstname)
    println("My first name is $firstname ")
    var num1 = 67
    var num2 = 20
    println("The sum of $num1 and $num2 is " +(num1+num2))


}