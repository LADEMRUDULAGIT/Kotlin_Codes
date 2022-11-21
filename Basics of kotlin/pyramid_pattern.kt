import java.util.Scanner
fun main(){
    var n=5
    for(i in 1..n){
        for(j in n downTo i){
             if(j==i){
                 print("* ")
             }
            else{
                print(" ")
             }
        }
        for(j in 2..i){
            print("* ")
        }
        println()
    }
}