import java.lang.StringBuilder

fun entry() {
    var result = StringBuilder()
    print("enter your name:")
    var nameEntry: String = readln()
    println("$nameEntry")
    print("enter four different digits:")
    val digitEntry = readln()
    val number = digitEntry.toInt()
//    result.append(nameEntry)
//    result.append(digitEntry)
//    var builder = result.toString()
//    println(builder)
    println(nameEntry + digitEntry)
}
