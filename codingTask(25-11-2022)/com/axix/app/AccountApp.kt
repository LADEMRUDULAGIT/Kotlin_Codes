import java.util.*

fun main(){
    var accountService=AccountService()
    var sc= Scanner(System.`in`)
    println("Create an account")
    print("AccountNo:")
    var accountNo=sc.nextInt()
    print("Choose Account Type:")
    println("1.savings 2.current")
    var type=sc.nextInt()
    var accType:String
    if(type==1) accType="savings"
    else accType="current"
    var account=AccountApp(accountno=accountNo,accounttype=accType)
    println("Account Created Successfully")
    println("===========Perform Operations===============")
    while(true){
        println("1.withdraw   2.deposit   3.getbalance")
        println("Enter choice:")
        var choice=sc.nextInt()
        when(choice){
            1->{
                println("Enter amount withdraw:")
                var amount=sc.nextDouble()
                accountService.withdraw(amount,account)
            }
            2->{
                println("Enter amount to deposit:")
                var amount=sc.nextDouble()
                accountService.deposit(amount,account)
            }
            3->{
                accountService.getbalance(account)
            }
            else-> {
                println("=========Transaction Completed==========")
                break
            }
            }
        }
    }