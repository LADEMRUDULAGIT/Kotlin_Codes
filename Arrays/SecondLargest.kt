package Arrays
import java.util.Scanner
fun main(args:Array<String>){
    var max=0
    var second_max=0
    var sc=Scanner(System.`in`)
    print("Enter Array Size :")
    var n=sc.nextInt()
    println("Enter Values :")
    var arr=Array(n,{0})
    for(i in 0..(n-1)){
        var obj=sc.nextInt()
        arr.set(i,obj)
    }
    max=arr[0]
    for(i in arr){
        if(max<i){
            max=i
        }
    }
    for(i in arr){
        if(max!=i && second_max<i){
            second_max=i
        }
    }
    print("Second Largest value in an array :$second_max")
}