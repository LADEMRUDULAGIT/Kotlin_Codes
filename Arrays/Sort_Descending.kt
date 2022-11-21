package Arrays
import java.util.Scanner
fun main(args:Array<String>){
    var sc=Scanner(System.`in`)
    print("Enter Array Size :")
    var n=sc.nextInt()
    println("Enter Values :")
    var arr=Array(n,{0})
    for(i in 0..(n-1)){
        var obj=sc.nextInt()
        arr.set(i,obj)
    }
    print("Array values are :")
    for(i in 0..(n-1)){
        for(j in i+1..(n-1)){
            if(arr[i]<arr[j]){
                var temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
    }
    for(i in 0..(n-1)){
        print("${arr[i]} ")
    }
}