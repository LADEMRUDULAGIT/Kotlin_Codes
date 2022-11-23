fun main(){
var products= mutableListOf<product>()
    products.add(product(1,"laptop",23000.50))
    products.add(product(2,"smartphone",15000.5))
    products.add(product(3,"tablet",20000.50))
    println("id       name      price")
    for(item in products){
        println("${item.id}   ${item.name}   ${item.price}")
    }
}
class product(id:Int,name:String,price:Double){
    var id:Int=id
    var name:String=name
    var price:Double=price
}
