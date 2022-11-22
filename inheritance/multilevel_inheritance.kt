fun main(args:Array<String>){
    var obj=Room()
    obj.diplayType()

}
open class Apartment{
    open fun diplayType(){
        println("this is an Apartment")
    }
}
open class House:Apartment(){
    override fun diplayType(){
        println("this is House")
        super.diplayType()
    }
}
class Room:House(){
    override fun diplayType(){
        println("this is Room")
        super.diplayType()
    }
}