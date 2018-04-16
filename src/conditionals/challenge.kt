package conditionals

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) +1
    when(random){
        in 1..10 -> println("$random intre 1 si 10")
        in 11..20 -> println("$random intre 11 si 20")
        in 21..30 -> println("$random intre 21 si 30")
        in 31..40 -> println("$random intre 31 si 40")
        else -> println("$random > 40")
    }
}