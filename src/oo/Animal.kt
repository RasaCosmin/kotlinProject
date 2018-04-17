package oo

open class Animal {
    private var age: Int = 0
    protected var name = "caine"
    internal val isDangerous = true

    fun getAge(): Int{
        return age
    }

    fun setAge(age: Int){
        this.age = age
    }
}

class Vertebrate : Animal(){
    fun introduceYourself(){
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.setAge(8)
    println(animal.getAge())
}