fun main(args:Array<String>){
    var age=8
    try{
        checkeligibility(age)
    }
    catch (e:Exception){
        println(e.message)
    }
}
fun checkeligibility(age:Int){
        if(age>=18){
            println("you are eligible to vote")
        }
        else{
            throw Exception("you are not eligible to vote")
        }
}