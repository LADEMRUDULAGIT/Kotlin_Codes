package Arrays
import java.util.Scanner
fun main(args:Array<String>){
    var min=0
    var sc=Scanner(System.`in`)
    print("Enter Array Size :")
    var n=sc.nextInt()
    println("Enter Values :")
    var arr=Array(n,{0})
    for(i in 0..(n-1)){
        var obj=sc.nextInt()
        arr.set(i,obj)
    }
    min=arr[0]
    for(i in arr){
        if(min>i){
            min=i
        }
    }
    print("Smallest value in an array :$min")
}