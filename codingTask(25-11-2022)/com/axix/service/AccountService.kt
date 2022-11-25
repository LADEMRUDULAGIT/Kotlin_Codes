class AccountService{

    fun withdraw(amount:Double,account:AccountApp){
        if(amount<=account.balance){
            account.balance=account.balance-amount
        }
        else{
            println("balance is less than withdrawing amount")
        }
    }
    fun deposit(amount:Double,account:AccountApp){
        account.balance=account.balance+amount
    }
    fun cal_RateOfINTREST(account:AccountApp):Double{
        var rateofinterst:Double
        if(account.accounttype=="savings"){
            rateofinterst=account.balance*(0.06)
        }
        else{
            rateofinterst=account.balance*(0.1)
        }
        return rateofinterst
    }
    fun getbalance(account:AccountApp){
        var rateofintrest=cal_RateOfINTREST(account)
        println("AccountNo    Balance      AccountType")
        println("${account.accountno}     ${account.balance+rateofintrest}     ${account.accounttype}")
    }
}