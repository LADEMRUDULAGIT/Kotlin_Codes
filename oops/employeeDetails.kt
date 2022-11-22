fun main(args:Array<String>){
     var emp:Employee=Employee(1,"mrudu",20000,24)
    println("salary per day: ${emp.calculatePerdaySalary()}")
    println(emp.totalSalaryEarned())
}
class Employee {
    var id: Int = 0
    var name: String = ""
    var salary: Int = 0
    var noOfDaysPresent:Int=0
    constructor(id:Int,name: String,salary: Int,noOfDaysPresent:Int){
        this.id=id
        this.name=name
        this.salary=salary
        this.noOfDaysPresent=noOfDaysPresent
    }
    fun calculatePerdaySalary():Int{
        return salary/30
    }
    fun totalSalaryEarned():String{
        return "total salary is: ${noOfDaysPresent*calculatePerdaySalary()}"
    }
}
