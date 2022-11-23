fun main(){
    var marks= mutableListOf(10,23,24,53)
    println(marks)
    println()
    marks.add(78)
    marks.add(89)
    println("size : ${marks.size}")
    println("is it found : ${marks.contains(10)}")
    println("is it found : ${marks.contains(19)}")
}