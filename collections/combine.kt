fun main() {

    var JavaBatch= mutableListOf<String>("Anil","Gopal","Ankit","Manish")
    var KotlinBatch= mutableListOf<String>("Ankit","Kumar","Manish","Rahul")
    var list= mutableListOf<String>()
    println("Java Batch list: $JavaBatch")
    println("Kotlin Batch List: $KotlinBatch")
    JavaBatch.addAll(KotlinBatch)
    println("After Combining : $JavaBatch")
    for( name in JavaBatch)
    {
        if(!list.contains(name))
        {
            list.add(name)
        }
    }
    println("After Removing duplicates: $list")

    list.sort()
    println("After Sorting: $list")

    var JavaBatch1= mutableListOf<String>("Anil","Gopal","Ankit","Manish")
    var KotlinBatch1= mutableListOf<String>("Ankit","Kumar","Manish","Rahul")
    JavaBatch1.addAll(KotlinBatch1)
    JavaBatch1= JavaBatch1.distinct().toMutableList()
    JavaBatch1.sort()
    println(JavaBatch1)
}