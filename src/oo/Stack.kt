package oo

class Stack<T>(vararg val items: T) {
    private val elements = items.toMutableList()

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T? {
        if (!isEmpty())
            return elements.removeAt(elements.size - 1)
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(3, 4, 2, 5)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.push(55))
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")
    println(stack2.pop())
    println(stack2.pop())
    println(stack2.pop())
    stack2.push("salut")
    println(stack2.pop())
}