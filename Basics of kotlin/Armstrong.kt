import java.util.Scanner
import java.lang.Math
fun main(){
    var sc=Scanner(System.`in`)
    print("Enter number:")
    var n=sc.nextInt()
    var m=n
    var count=n.toString().length
    var r=0
    var sum=0.0
    while(n>0){
        r=n%10
        n=n/10
        sum+=Math.pow(r.toDouble(),count.toDouble())
    }
    if(m==sum.toInt()){
        print("$m is an Armstrong number")
    }
    else{
        print("$m is not an Armstrong number")
    }
}