fun main() {
//   contactList()
//    first()
//    calculator()
//    entry()
//    list()
 //   game()
    //learn()
   //lambda()
    //function()
}

fun first() {
    println("Hello World!")
    val name:String = "Mason Mount"
    var club: String? ="Arsenal"
    println(name)
    println(club)
    when(club) {
        null -> println("none")
        else -> println(club)
    }

    val footballPlayers= arrayOf("foden","karim","grealish","eden")
    println(footballPlayers.size)
    println(footballPlayers[2])
    for (footballPlayer in footballPlayers) {
        println(footballPlayer)
    }
    footballPlayers.forEach { it
        println(it)
    }
    val footballClubs = mutableListOf("Everton","Southampton","Liverpool","Tottenham")
    println(footballClubs.size)
    println(footballClubs)
    footballClubs.forEach { footballClub->
        println(footballClubs)
    }
    /*
    Try adding program arguments via Run/Debug configuration.
    Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html
    */
}