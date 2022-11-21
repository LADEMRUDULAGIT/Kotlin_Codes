package Arrays
import java.util.Scanner
fun main(args:Array<String>){
    var sum=0
    var sc=Scanner(System.`in`)
    print("Enter Array Size :")
    var n=sc.nextInt()
    println("Enter Values :")
    var arr=Array(n,{0})
    for(i in 0..(n-1)){
        var obj=sc.nextInt()
        arr.set(i,obj)
    }
    for(i in arr){
        sum+=i
    }
    print("Sum of values in an array :$sum")
}