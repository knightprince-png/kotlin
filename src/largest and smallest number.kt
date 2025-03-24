import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = scanner.nextInt()

    print("Enter second number: ")
    val num2 = scanner.nextInt()

    print("Enter third number: ")
    val num3 = scanner.nextInt()

    val largest = maxOf(num1, num2, num3)
    val smallest = minOf(num1, num2, num3)

    println("Largest number: $largest")
    println("Smallest number: $smallest")
}
