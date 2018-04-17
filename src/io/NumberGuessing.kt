package io

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(100) +1

    var input: String?
    var guess = -1

    while (guess!=random){
        print("Guess a number intre 1 si 100:")
        input = readLine()
        if(input !=null){
            guess = input.toInt()
        }

        if(guess < random){
            println("mai mic")
        }else if(guess>random){
            println("mai mare")
        }else{
            println("ai ghicit")
        }
    }
}