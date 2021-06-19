package Exercises



fun main ( ){

    var nullname : String? =" alex"
    nullname = null
    // null check
    var lenth = 0
    if ( nullname != null ) {
        lenth =( nullname.length)} else {  lenth =-1}

    println(lenth)

// use this  short form below

    val l = if ( nullname != null ) nullname.length else -1
    println(l)

    println((nullname?.length))

// elvis method using ?:
    var noname = nullname ?: " no one has this name "
    println( noname)

// testing nullity
    var y :String? = " "
    y = null
    var i = y ?: 34
    print(i)
}








