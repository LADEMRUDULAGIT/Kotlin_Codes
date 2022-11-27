fun main(args: Array<String>) {

    println("======wrestler demo======")
    var wrestlerService=WrestlerService()
    var wrestlers=  wrestlerService.displayAllWrestler()
    for ( wrestler in wrestlers)
        println(wrestler)

    println("==============")
    var sorteByName:List<Wrestler> = wrestlerService.sortByName()
    for (wrestler in sorteByName)
        println(wrestler)

}

// model class
data class Wrestler(var name:String,var height:Double,var weight:Double,var age:Int)

// service for writing business logic
class WrestlerService
{
    var wrestlerUtil=WrestlerUtil()

    fun displayAllWrestler():MutableList<Wrestler>
    {
        return  wrestlerUtil.wrestlerData()
    }

    fun sortByName():List<Wrestler>
    {
        return wrestlerUtil.wrestlerData().sortedBy { it.name }
    }
}

class WrestlerUtil
{
    var wrestlers = mutableListOf<Wrestler>()
    init {
        wrestlers.add(Wrestler("sachin",5.9,230.45,36))
        wrestlers.add(Wrestler("john",5.2,180.45,32))
        wrestlers.add(Wrestler("manish",4.9,130.45,28))
        wrestlers.add(Wrestler("sourab",6.1,210.45,33))
    }
    fun wrestlerData():MutableList<Wrestler>
    {
        return  wrestlers
    }
}