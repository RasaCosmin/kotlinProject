package oo

interface Drivable {
    fun drive()
}

interface Buildable{
    val timeRequired: Int
    fun build()
}

class Car(val color: Color): Drivable, Buildable{
    override val timeRequired: Int = 23

    override fun drive() {
        println("driving car")
    }

    override fun build() {
        println("build a $color car")
    }
}

class MotorCycle(): Drivable{
    override fun drive() {
        println("driving motor")
    }
}

fun main(args: Array<String>) {
    val car: Drivable = Car(Color.RED)
    car.drive()

    val motorCycle: Drivable = MotorCycle()
    motorCycle.drive()
}
