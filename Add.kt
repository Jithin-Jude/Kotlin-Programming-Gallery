import java.util.Scanner

fun main(args : Array<String>){
    val reader = Scanner(System.`in`)

    val num1:Int
    val num2:Int

    print("Enter first number: ")
    num1 = reader.nextInt()
    print("Enter second number: ")
    num2 = reader.nextInt()

    print("$num1 + $num2 = ${num1+num2}")
}