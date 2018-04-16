package loops

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..10) {
        sum += i
        println(i)
    }
    println(sum)

    val list = listOf("Java", "Kotilin", "C++")
    for (i in 0 until list.size) {
        println(list[i])
    }
    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }

    var i = 0
    while (i<=10){
        println(i)
        i++
    }

    for(c in "Kotlin"){
        if('l' == c)
            break
        print(c)
    }
    println()

    val lis1t = listOf("Book", "Table", "Laptop")

    for(str in  lis1t){
        if(!str.contains('o')){
            continue
        }
        println(str)
    }

    outer@ for(i in 1..10){
        for(j in 1..10){
            if(i-j==5){
                break@outer
            }
            println("$i - $j")
        }
    }

    var sum1 = 0L
    for(i in 100..100000L)
        sum1+=i
    println(sum1)
}