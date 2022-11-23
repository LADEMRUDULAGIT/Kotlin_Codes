fun main(){
    var players= mutableMapOf<String,String>()
    players.put("sachin","batsmen")
    players.put("dhoni","wicket keeper,btsmen")
    players.put("shami","bowler")
    players.put("dhoni","coach")
    println(players)
    println(players.size)
    println("keys: ${players.keys}")
    println("values: ${players.values}")
    println("both key value pairs: ${players.entries}")
    println("${players.get("dhoni")}")
    for(i in players.keys)
        print("$i ")
    println()
    for(keyvalue in players.entries)
        println(keyvalue)
    var gadgets= mutableMapOf("laptop" to 50000 ,"phone" to 20000 ,"watch" to 2500)
    println(gadgets)
    for(i in gadgets.entries){
        println("${i}   ${i.key}  ${i.value}")
    }
}