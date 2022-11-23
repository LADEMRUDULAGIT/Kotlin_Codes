fun main(){
    var emp_det= mutableListOf<Employeedetails>()
    emp_det.add(Employeedetails(1,"mrudula","developing",23,50000.80))
    emp_det.add(Employeedetails(2,"srivani","testing",25,40000.80))
    emp_det.add(Employeedetails(3,"yamini","web developer",23,25000.80))
    emp_det.add(Employeedetails(4,"ushi","web developer",26,24000.80))
    emp_det.add(Employeedetails(5,"prudhvi","ui designer",26,23000.80))

    println("id       name      dept       age     salary")
    for(item in emp_det){
        println("${item.id}   ${item.name}   ${item.dept}  ${item.age}  ${item.salary}")
    }
}
class Employeedetails(id:Int,name:String,dept:String,age:Int,salary:Double){
    var id:Int=id
    var name:String=name
    var salary:Double=salary
    var dept:String=dept
    var age:Int=age
}
