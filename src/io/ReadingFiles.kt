package io

import java.io.File

fun main(args: Array<String>) {
    var lineNr = 0
    File("src/inputfile.txt").forEachLine {
        lineNr++
        println("$lineNr " +it)
    }
}