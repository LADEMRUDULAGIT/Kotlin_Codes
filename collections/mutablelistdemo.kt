fun main(){
    var num1= mutableListOf(1,2,3,4)
    var num2= mutableListOf(5,6,7,8)
    println("num1 $num1")
    println("num2 $num2")
    num1.addAll(num2)
    println("after addind num1 and num2 $num1")

    num1.removeAll(num2)
    println("after removing num2 from num1 $num1")

    num1.retainAll(num2)

}