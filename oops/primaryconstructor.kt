fun main(args:Array<String>){
    var emp:Employee1=Employee1(name="mrudu",salary=200, noOfDaysPresent =24)
    emp.displaydetails()
    println("salary per day: ${emp.calculatePerdaySalary()}")
    println(emp.totalSalaryEarned())

}
class Employee1(id:Int=4,name: String,salary: Int,noOfDaysPresent:Int){
    var id: Int = id
    var name: String = name
    var salary: Int = salary
    var noOfDaysPresent:Int=noOfDaysPresent
    var details:String=""
    init{
        println("$name is good")
        details="$id $name"

    }
    fun displaydetails(){
        println("$details")
    }
    fun calculatePerdaySalary():Int{
        return salary/30
    }
    fun totalSalaryEarned():String{
        return "total salary is: ${noOfDaysPresent*calculatePerdaySalary()}"
    }
}
