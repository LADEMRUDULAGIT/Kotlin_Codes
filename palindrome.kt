import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    print("enter a number:")
    var n=sc.nextInt()
    var str=n.toString()
    var r=0
    var str1=""
    while(n>0){
        r=n%10
        n=n/10
        str1+=r.toString()
    }
    if(str.equals(str1))
    {
        print("$str is a palindrome")
    }
    else{
        print("$str is not a palindrome")
    }
}