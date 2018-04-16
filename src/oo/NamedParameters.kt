package oo

class House(val height: Double, val color: String, val price: Int = 50000){
    fun print(){
        println("House [height = $height, color = $color, price = $price")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 4.5, color = "blue", price = 15000)
    house.print()
    val redHouse = House(color = "red", height = 23.3, price = 23322)
    redHouse.print()

    val yellowHouse = House(color = "yellow", height = 231.2)
    yellowHouse.print()
}