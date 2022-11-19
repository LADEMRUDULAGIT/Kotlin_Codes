import java.util.Scanner
fun main() {
    val sc  = Scanner(System.`in`)
    println("Enter Values for a and b :")
    var a = sc.nextInt()
    var b = sc.nextInt()
    println("a is : $a")
    println("b is : $b")
    println("----Swapped Values using temp----")
    var temp=a
    a=b
    b=temp
    println("a is : $a")
    println("b is : $b")
    println("----Swapped Values without using temp----")
    a=b*a
    b=a/b
    a=a/b
    println("a is : $a")
    println("b is : $b")
}