package palindrome

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Enter string : ")
    val originalString = sc.nextLine()

    var reverseString = ""
    var length = originalString.length

    for (i in (length-1) downTo 0){
        reverseString += originalString[i]
    }

  //if (originalString.toLowerCase().equals(reverseString.toLowerCase()))
    if (originalString.equals(reverseString, ignoreCase = true)){
        println("$originalString is Palindrome")
    }else{
        println("$originalString is NOT a Palindrome")
    }
}