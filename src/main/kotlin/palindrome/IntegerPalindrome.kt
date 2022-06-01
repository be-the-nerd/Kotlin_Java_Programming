package palindrome

import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)
    print("Enter number : ")
    val originalNumber = sc.nextInt()

    var reverseNumber = 0
    var temp = originalNumber

    while (temp>0){
        val remainder = temp%10
        reverseNumber = (reverseNumber*10)+remainder
        temp /= 10
    }

    if (originalNumber == reverseNumber){
        println("$originalNumber is Palindrome")
    }else{
        println("$originalNumber is NOT a Palindrome")
    }
}