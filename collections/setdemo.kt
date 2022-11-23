fun main(){
    var num1= mutableSetOf(1,2,3,4,5,1,2)
    println(num1)
    var KotlinBatch= mutableListOf<String>("Ankit","Kumar","Manish","Rahul")
    KotlinBatch.add("Ankit")
    println(KotlinBatch)
    var KotlinBatch1=KotlinBatch.toSet()
    println(KotlinBatch1)
}