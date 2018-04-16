package functions

import java.util.*

fun main(args: Array<String>) {
    helloWorld()
    printSpaces("kotlin")
    println(getCurrentDate())
    println(max(32,321))

    val nrs = listOf(1,2,3,4,5,6,7,8,9)
    println(reverse2(nrs))
}

fun helloWorld(){
    println("Salut")
}

fun printSpaces(text: String){
    for(c in text){
        print(c + " ")
    }
    println()
}

fun getCurrentDate(): Date{
    return Date()
}

fun max(a: Int, b: Int): Int{
    return if(a>=b){
        a
    }else{
        b
    }
}

fun reverse(nrs: List<Int>):List<Int>{
    val result = arrayListOf<Int>()
    for(i in 0 until nrs.size){
        result.add(nrs[nrs.size-1-i])
    }
    return result
}

fun reverse2(nrs: List<Int>):List<Int>{
    val result = arrayListOf<Int>()
    for(i in nrs.size downTo 1){
        result.add(nrs[i-1])
    }
    return result
}
