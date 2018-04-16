package conditionals

fun main(args: Array<String>) {
    val age: Int = 21
    if(age < 18){
        println("Nu ai 18 ani!")
    }else{
        println("Te-ai inregistrat")
    }

    val mode: Int = 6
    var modeString: String? = null

    modeString = when(mode){
        1 -> getMode("angry")
        2 -> getMode("sad")
        3 -> getMode("busy")
        else -> getMode("happy")
    }

    println("Esti $modeString")

    val x = 20

    when(x){
        5 -> println("x is 5")
        4*5 -> println("x is 5*4")
        "hey there".length -> println("x are lungimea stringului")
        !in 1..9 -> println("nui intre 1 si 9")
        in 1..10 -> println("intre 1 si 10")
        in 11..100 -> println("intre 11 si 100")

    }

}

fun getMode(mode: String):String{
    return mode
}