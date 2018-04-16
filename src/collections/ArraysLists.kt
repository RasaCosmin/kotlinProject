package collections

fun main(args: Array<String>) {
    val array = arrayOf("Alba", "Cluj", "Sibiu")
    val mixedArray = arrayOf("Kotlin", 12, 3.4, false)
    val numbers = intArrayOf(2, 23, 32,31)
    println(mixedArray[0])
    mixedArray[2]= "Salut"
    println(mixedArray[2])
    var str = "Udemy"
    println(str[2])

    val states = arrayOf("buc", "tm")
    val allstetes = array + states
    println(allstetes)
    println(allstetes.size)

    val empty = numbers.isEmpty()
    println(empty)

    if(states.contains("Alba")){
        println("contine")
    }else{
        println("nu contine")
    }

    val list = listOf("Protocala", "cirese")

    val arrayList = arrayListOf("Ion", "Gheorghe")
    println(arrayList[0])
    val list1 = arrayListOf("petrica")
    println(arrayList + list1)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("dumitru"))
    arrayList.add("mitica")
    println(arrayList + list1)
    arrayList.add(1, "cosmin")
    println(arrayList + list1)

   val removed = arrayList.remove("mitica")

    println(arrayList + list1)
    println(removed)

    val sublist = (arrayList+list1).subList(1, 4)
    println(sublist)
}