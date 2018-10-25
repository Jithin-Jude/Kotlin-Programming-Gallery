import java.util.Scanner

fun main(args : Array<String>){
    val reader = Scanner(System.`in`)
    println("Enter a number")
    var num:Int = reader.nextInt()

    if (num % 2 == 0){
        println("$num is even.")
    }else{
        println("$num is odd.")
    }
}