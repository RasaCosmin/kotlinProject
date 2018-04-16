package oo

abstract class Person(open val name: String, open var age: Int) {


    abstract fun speak()

    open fun greet(name: String) {
        println("Salut $name!")
    }

    fun getBirthYear(): Int = 2018 - age
}

fun main(args: Array<String>) {
    val person = Employee("Ion", 21)
    println("${person.name} are ${person.age}")
    person.speak()
    person.greet("Ilie")
    println(person.getBirthYear())
}