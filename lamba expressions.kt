package Exercises




fun main(){
    // lambda expression

//    form one
    var i = { x: Int -> x * x}
    println (i(5))
    val y = { a: Int, b:Int, c : Int -> (a*a) + (b*b) - 4 *a*c}
    println ( y(6,8,5))

// form two
    var t: (Int) -> Int = { t -> t * t }
    println(t(5))

    val u : ( Int, Int, Int ) -> Int = { a,b,c ->   (a*a) + (b*b) - 4 *a*c}
    println (u (6,8,5))
}