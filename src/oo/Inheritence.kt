package oo

class Student(override val name:String, override var age: Int, val sudentID: Long): Person(name, age){
    override fun speak() {
        println("salut sunt student")
    }

    fun isIntelligent() = true

    override fun greet(name: String) {
        println("Buna $name")
    }
}

class Employee(override val name: String, override var age: Int): Person(name, age){
    override fun speak() {
        println("salut sunt un employee")
    }

    fun receivePayment(){
        println("payment received")
    }
}

fun main(args: Array<String>) {
    val student = Student("ilie", 32, 3231)
    student.speak()
    println(student.isIntelligent())
    student.greet("Ion")

    val employee = Employee(age = 23, name = "ion")
    println(employee.getBirthYear())
    employee.receivePayment()
    employee.greet("ilie")
}