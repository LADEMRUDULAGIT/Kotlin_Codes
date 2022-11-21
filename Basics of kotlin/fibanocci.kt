import java.util.*

fun main(){
    print("enter count:")
    val sc=Scanner(System.`in`)
    var n=sc.nextInt()
    var n1=0
    var n2=1
    var n3=0
    print("$n1 $n2 ")
    while(n>2){
        n3=n1+n2
        n1=n2
        n2=n3
        print("$n3 ")
        n--
    }
}
