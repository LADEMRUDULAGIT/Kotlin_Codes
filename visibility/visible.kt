package visibility
fun main(args:Array<String>){
     var ani=Animal()
    println(ani.b)
    println(ani.d)
}
open class Animal{
    private var a=10
    internal var b=11
    protected var c=12
    var d=13

}
class Cat: Animal(){
    fun test2(){
        println("$c")
    }
}
class Dog{
    var ani=Animal()
    fun test1(){
        println(ani.b)
    }
}