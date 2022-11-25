import java.util.Scanner
fun main(){
    var sc=Scanner(System.`in`)
    println("enter age:")
    var age=sc.nextInt()
    var getagegroup:(Int)->String={age->
        if (age<18)
           "Non-Adult"
        else if(age>=18 && age<=55)
            "Adult"
        else
            "Senior Citizen"
    }
    println(getagegroup(age))
}