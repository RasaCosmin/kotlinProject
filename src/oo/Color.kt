package oo

enum class Color(var rgb: Int) {
    RED(0xFF0000),BLUE(0x0000FF),GREEN(0x00FF00), YELLOW(0xFFFF00);

    fun containRed(): Boolean{
        return this.rgb and 0xFF0000 !=0
    }
}

fun main(args: Array<String>) {
    println(0x10)
    println(0x1F)
    println(0x20)

    println(0b1101 and 0b0011) //0b0001
}