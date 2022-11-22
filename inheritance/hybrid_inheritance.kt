open class BaseClass(){
    fun testa(){
        println("testA")
    }
}
open class Child1Class:BaseClass(){
    fun testb(){
        println("testB")
    }
}
open class Child2Class:BaseClass(){
    fun testd(){
        println("testB")
    }
}
class GrandChildClass:Child1Class(){
    fun testc(){
        println("testC")
    }
}
fun main(args: Array<String>)
{
    var gc = GrandChildClass()
    // calling methods from base and child classes
    gc.testa()
    gc.testb()
    gc.testc()
    var c2c = Child2Class()
    c2c.testd()
    c2c.testa()
}