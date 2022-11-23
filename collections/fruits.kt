fun main(){
    var fruits= mutableListOf("apple","orange","banana","guava")
    println(fruits)
    println()
    fruits.add("pineapple")
    fruits.add("papaya")
    println("size : ${fruits.size}")
    println("is it found : ${fruits.contains("orange")}")
    println("is it found : ${fruits.contains("jackfruit")}")
    println("${fruits.first()}")
    println("${fruits.last()}")
    fruits.clear()
    println(fruits)
}