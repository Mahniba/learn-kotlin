import kotlin.math.ceil

fun add(a: Int, b:Int) {
    val sum : Int = a+b
    println(sum)
}
fun difference(a:Int,b:Int) {
    val subtract :Int = a-b
    println(subtract)
}
fun multiply(a:Int,b:Int){
    val mul :Int = a*b
    println(mul)
}
fun division(
    a: Double,
    b: Double,
){
    val divide: Double = a/b
    println(ceil(divide))
}
fun calculator(){
    add(1,5)
    difference(6,2)
    multiply(3,2)
    division(6.0,2.0)
}