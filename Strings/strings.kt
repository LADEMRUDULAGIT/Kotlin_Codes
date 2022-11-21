package Strings
fun main(args:Array<String>){
    var str="Hello, I am programming in kotlin"
    println("$str")
    var str1="Hello this is new string, I am programming " +
            "in kotlin"
    println("$str1")
    var str2=""" Hello this is 
        multi line string
    """.trimIndent()
    println("$str2")
    var str3="""Hello this is 
        |multi line string
        |by trimmargin
    """.trimMargin("|")
    println(str3)
    var str4="mrudula"
    println(str4[0])
    println(str4[1])
    println("length: "+str4.length)
    var str5="srivani"
    println(str4.equals(str5))
    println(str5.get(0))
    println(str5.indices)
    println(str5.subSequence(3,6))
    //println(str5.compareTo("vani"))
    println(str4==str5)
    println(str4===str5)//ponting to the same string pool
    println(str4.toUpperCase())
    println(str5.indexOf("vani"))
}