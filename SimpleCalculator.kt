import java.util.Scanner

fun main(args : Array<String>){
    var choice:Int
    var a:Float
    var b:Float
    var result:Float

    val reader = Scanner(System.`in`)

    while(true) {
        println("\u001b[H\u001b[2J")
        print("Simple Calculator\n" +
                "=================\n\n" +
                "1.Add\n" +
                "2.Subtract\n" +
                "3.Product\n" +
                "4.Divide\n")
        choice = reader.nextInt()

        print("Give first number:")
        a = reader.nextFloat()

        print("Give second number:")
        b = reader.nextFloat()


        when (choice) {
            1 -> {
                result = sum(a, b)
                print("$a + $b = $result\n\n")
            }
            2 -> {
                result = sub(a, b)
                print("$a - $b = $result\n\n")
            }
            3 -> {
                result = mult(a, b)
                print("$a * $b = $result\n\n")
            }
            4 -> {
                result = div(a, b)
                print("$a / $b = $result\n\n")
            }
        }
    }
}

fun sum(a:Float, b:Float):Float {
    return a+b
}

fun sub(a:Float, b:Float):Float {
    return a-b
}

fun mult(a:Float, b:Float):Float {
    return a*b
}

fun div(a:Float, b:Float):Float {
    return a/b
}