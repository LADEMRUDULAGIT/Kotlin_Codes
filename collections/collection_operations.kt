fun main(){
    var num= mutableListOf(1,2,3,4,5)
    println(num)
    println(num.size)
    println(num.any {it%2==0}) //if any value in the list % 2==0 then it will give true
    println(num.any {it>2})

    println(num.all {it%2==0})
    println(num.all {it<10})

    println(num.count())
    println(num.count() {it>2})

    println(num.max())
    println(num.min())
}