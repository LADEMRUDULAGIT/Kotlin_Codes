import java.util.InputMismatchException
import java.util.Scanner
fun main(){

    try{
        var sc=Scanner(System.`in`)
        print("enter a num1:")
        var n1=sc.nextInt()
        print("enter a num2:")
        var n2=sc.nextInt()
        var value=n1/n2
        println("$value")
    }
    catch (e:ArithmeticException){
        println("the input should not have zero")
    }
    catch (e:InputMismatchException){
        println("please enter strings")
    }
    finally {
        println("closed")
    }
}