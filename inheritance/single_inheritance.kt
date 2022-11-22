fun main(args:Array<String>){
    var practi=Practical()
    practi.displaymarks()

}
open class Exam{
    open fun displaymarks(){
        println("this is Normal Exam")
    }
}
class Practical:Exam(){
    override fun displaymarks(){
        println("this is Practical Exam")
        super.displaymarks()
    }
}