fun game(){
    val quiz = mutableMapOf("favourite meal?" to "spaghetti", "best snack" to "pizza", "best choice of fruit" to "apple")
    var score = 0
    for (question in quiz ) {
        println(question.key)
        var userAnswer = readln()
        if (userAnswer == question.value) {

            println("correct")
            score++
            println(score)
        } else {
            println("incorrect, the correct answer is ${question.value}")
            println(score)
        }
        print("do you want to go to the next question?:")
        var endgame = readln()
        if (endgame == "yes") {
            continue
        } else {
            break
        }

    }}

