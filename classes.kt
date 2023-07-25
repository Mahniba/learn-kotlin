//creating a class in kotlin
class Car(val make:String, val model:String){
    // class methods
    fun accelerate(){
        println("vroom, vroom")
    }
}
class Truck(val make:String, val model:String, val towingCapacity: Int){
    fun tow(){
        println("taking the horses to the rodeo")
    }
}
open class Vehicle(val make:String, val model:String){
    fun accelerate(){
        println("vroom,vroom")
    }
    fun park(){
        println("park the car here")
    }
}
//inheritance and sub classes
//class Car(val make:String, val model:String):Vehicle(val make:String, val model:String){
   //override accelerate(){

   //}
//}
//fun main(){
    //val tesla= Car()
//}