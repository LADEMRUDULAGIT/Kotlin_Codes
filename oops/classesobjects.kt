package oops
fun main(args:Array<String>){
    var car:Car=Car("2018","red",40000,10000)
    car.displaycarinfo()
    println(car.checkCarStatus())

}
class Car{
    var modelno:String=""
    var color:String=""
    var Km:Int=0
    var price:Int=0
    fun displaycarinfo(){
        println("$modelno $color $Km $price" )
    }
    constructor(modelno:String,color:String,price:Int,Km:Int){
        this.modelno=modelno
        this.color=color
        this.Km=Km
        this.price=price
    }
    fun checkCarStatus():String{
        if(Km<5000)
            return "car is in new condition"
        else if(Km>5000 && Km<20000)
            return "car is in good condition"
        return "car is old"
    }
}