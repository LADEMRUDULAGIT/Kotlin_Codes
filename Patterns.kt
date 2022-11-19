fun main() {
    for (i in 1..3) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
    for (i in 1..3) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
    for (i in 1..3) {
        for (j in 1..i) {
            print("$i ")
        }
        println()
    }
    var alphabet = 'A'
    for (i in 1..3) {
        for (j in 1..i) {
            print("${alphabet} ")
        }
        ++alphabet
        println()
    }
    for (i in 1..5) {
        for (j in 1..5) {
            if(i==1||i==5||j==1||j==5)
              print("*")
            else
              print(" ")
        }
        println()
    }
}
