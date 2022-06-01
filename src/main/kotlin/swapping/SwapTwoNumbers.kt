fun main(args: Array<String>) {

    var firstNum = 1
    var secondNum = 2

    println("Numbers before swapping :")
    println("First Number : $firstNum")
    println("Second Number : $secondNum")

/*    val temporary = firstNum
    firstNum = secondNum
    secondNum = temporary*/
    //without using third variable
    firstNum = firstNum+secondNum
    secondNum=firstNum-secondNum
    firstNum=firstNum-secondNum
    println("Numbers after swapping :")
    println("First Number : $firstNum")
    println("Second Number : $secondNum")
}