fun main(args: Array<String>){
    var str1 = "Hello"
    var str2 = "WorldWorld"

    println("Strings before swapping : ")
    println("str1 : $str1")
    println("str2 : $str2")

    str1 = str1+str2  //HelloWorld
    str2 = str1.substring(0,str1.length-str2.length)
    str1 = str1.substring(str2.length)

    println("Strings after swapping : ")
    println("str1 : $str1")
    println("str2 : $str2")
}