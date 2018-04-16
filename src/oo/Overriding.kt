package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn(){
        println("Learning a $topic course")
    }
}

interface Learnable{
    fun learn(){
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotilin", 100.0), Learnable{
    final override fun learn() {
        super<Learnable>.learn()
        println("Invat $topic")
    }
}

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()

}