import java.util.Scanner

fun main() {
    var read=Scanner(System.`in`)
    println("Enter a number:")
    var number=read.nextInt()

    if (number==0){
        println("$number is a neutral number")
    }
    else if (number%2==0){
        println("$number is Even number")
    }
    else{
        println("$number is odd number")
    }

}