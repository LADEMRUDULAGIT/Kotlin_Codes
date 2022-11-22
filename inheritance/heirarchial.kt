fun main() {
    var cat=Cat()
    var dogs=Dogs()
    var cows=Cows()
    //all the sub clases invoking the method in super class
    cat.display()
    cat.cat()
    dogs.display()
    dogs.dog()
    cows.display()
    cows.cow()
}
open class Animals
{
    fun display()
    {
        println("Animal method is invoked")
    }
}
class Cat:Animals()
{
    fun cat()
    {
        println("Class Cat")
    }

}
class Dogs:Animals()
{
    fun dog()
    {
        println("Class Dogs")
    }
}
class Cows:Animals()
{
    fun cow()
    {
        println("Class Cows")
    }
}