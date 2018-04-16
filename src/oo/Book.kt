package oo

class Book(val title: String, val author: String, val publicationYear: Int){
    var borrowed: Boolean = false

    fun borrowed(){
        borrowed = true
    }

    fun returned(){
        borrowed = false
    }

    fun print(){
        println(title)
        println(author)
        println("$publicationYear")
        if(borrowed){
            println("is borrowed")
        }else{
            println("is returned")
        }
    }
}

fun main(args: Array<String>) {
    val book = Book("das", "das", 1991)
    book.print()
    book.borrowed()
    book.print()
    book.returned()
    book.print()
}