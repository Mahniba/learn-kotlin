fun list(){
    var  tasks = mutableListOf<String>()
    while (true){
        //display options
        println("1. add task")
        println("2.remove task")
        println("3.view task")
        println("4. exit")
        //read user choice
        print("enter user's choice:")
        var choice = readln()?.toInt()
        when (choice){
            1->{
                print("enter the task you want to add:")
                val task = readln()
                if (task != null){
                    tasks.add(task)
                    println("task added.")
                }
            }
            2->{
                print("enter the task to remove")
                val task = readLine()
                if (tasks != null && tasks.remove(task)){
                    println("task removed")
                }else{
                    println("task not found")
                }
            }
            3->{
                if (tasks.isEmpty()){
                    println("no task")
                } else{
                    println("task:")
                    for (task in tasks){
                        println("-$task")
                    }
                }
            }
            4->{
                return
            }
            else -> {
                println("invalid choice")
            }
        }
    }
}