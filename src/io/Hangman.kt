package io

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()
    if(word == null){
        println("No word given, game ended")
        return
    }

    for(i in 1..100){
        println()
    }

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses){
        printExploredWord(word, correctGuesses)
        println("#Wrong guesses: $fails\n\n")

        print("Guess letter: ")
        val input = readLine()
        if(input == null){
            continue
        }else if(input.length != 1){
            println("Please enter one letter")
            continue
        }

        if(word.toLowerCase().contains(input.toLowerCase())){
            correctGuesses.add(input[0].toLowerCase())
        }else{
            fails++
        }
    }

    printExploredWord(word, correctGuesses)
    println("#Wrong guesses: $fails\n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>){
    var guess = ""
    for(c in word.toLowerCase()){
        guess += if(correctGuesses.contains(c)){
            "$c "
        }else{
            "_ "
        }
    }
    println(guess)
}