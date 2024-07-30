fun main() {
    //Predefined Functions
    println("eMobilis")

    var squareroot = Math.sqrt(81.0)
    println("The square root is $squareroot")

    var round = Math.round(32.67)
    println("The result is $round")

    var myceil = Math.ceil(45.21)
    println("The output value is $myceil")

    day()
    add()
    student("Hamilton",39)
}

//User-defined Functions
fun day(){

    println("Today is Tuesday.")

}

fun add(){
    var num1 = 100
    var num2 = 56

    println(num1 + num2)
}

//Parameters and Arguments
fun student(name:String,age:Int){
    println("$name is $age years old")

}