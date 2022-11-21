import java.util.Scanner
fun main(){
    val sc=Scanner(System.`in`)
    println("Enter year:")
    var year=sc.nextInt()
    if(year%4==0 && year%100!=0 ||year%400==0 ){
        println("$year is leap year")
    }
    else{
        println("$year is not leap year")
    }
}