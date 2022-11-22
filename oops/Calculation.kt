import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("enter value for number1:")
    var n1=sc.nextInt()
    println("enter value for number2:")
    var n2=sc.nextInt()
    var cal=Calculation(n1,n2)
    println("1.ADD 2.SUBTRACT 3.MULTIPLICATION 4.DIVISION")
    println("Enter one choice:")
    var ch=sc.nextInt()
    var res= when(ch){
        1->cal.add
        2->cal.sub
        3->cal.multi
        4->cal.div
        else -> "choose number between 1 to 4"
    }
    println(res)
}
class Calculation(num1:Int,num2:Int){
    var add:String="Total value= ${num1+num2}"
    var sub:String="Subtracted value =${num1-num2}"
    var multi:String="Multiplied value = ${num1*num2}"
    var div:String="Divided Value=${num1/num2}"
}