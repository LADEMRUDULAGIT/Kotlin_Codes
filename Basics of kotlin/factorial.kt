import java.util.Scanner
fun main(){
    val sc=Scanner(System.`in`)
    println("enter number to find factorial")
    var n=sc.nextInt()
    var fact=1
    for(i in n downTo  1){
        fact=fact*i
    }
    println("Factorial of $n is :$fact")
}
