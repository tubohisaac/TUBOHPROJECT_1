package Exercises

fun main(){
    val a =3
    val b =5
    val c = " you are beautiful "
    val d = 35

    fun statement ( mood : String = " angry") {
        if ( mood == " angry"){
            println( " mark is $mood"  )} else {
            println ( " don not make Mark angry")}

    }
    statement( "Happy ")

    var fruits = arrayListOf("mango","oranges","apple", "watermelon")
    fruits.size
    fruits.add("pineapple")
    fruits.add(0, "guava")
    println(fruits.sorted())
    fruits.remove("watermelon")
    println(fruits.contains(" banana"))



    val  fruitz = listOf< String>("mango","oranges","apple", "watermelon")
    println(fruitz)
    println( fruitz.sorted())
    println(fruitz.size)


    var maPs = hashMapOf("one" to "1","two" to "2", "chops" to " N 2,300.00", "four" to "4", "five" to "5")
    println(maPs)
    println(maPs["one"])
    println(maPs.values)
    maPs.put("seven" ,"7")
    println(maPs)
}









