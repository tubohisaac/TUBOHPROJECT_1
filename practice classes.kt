package Exercises


open class Vehicle (val make:String,  val model: String){
    open fun detailsofvehicle(){ println( " these are the details $make, $model")}}

class Car (make: String,model: String , val colour: String): Vehicle(make, model){
    fun details (){ println(" This is a $colour $model $make ") }

    override fun detailsofvehicle() { println( " see detail below")
    } }

class Truck (  make: String, model: String, val toweringCapacity: Int): Vehicle(make, model){
    fun tow () { println ( "$make can be used for towing cars ")}
}

fun main(){
    var car = Car("Toyota", "Big Daddy", "red")
    car.detailsofvehicle()
    car.details()

    var truck = Truck("Innoson", " j45",10000)
    truck.tow()
    truck.detailsofvehicle()

    var y = Vehicle("Honda"," pilot")
    y.detailsofvehicle()
}