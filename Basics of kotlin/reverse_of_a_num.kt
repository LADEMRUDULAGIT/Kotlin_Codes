import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    print("enter a number:")
    var n=sc.nextInt()
    var r=0
    print("reversed number")
    while(n>0){
        r=n%10
        n=n/10
        print(r)
    }
}