package oo

class Books(val title: String, val author: String, val pubYear: Int, var price: Double){
    override fun toString(): String {
        return "Book(title=$title, author=$author, pubYear=$pubYear, price=$price)"
    }
}

data class DataBook(val title: String, val author: String, val pubYear: Int, var price: Double){

}

fun main(args: Array<String>) {
    val book = Books("carte", "ion", 2013, 199.0)
    val book2 = Books("carte", "ion", 2013, 199.0)
    val dataBook = DataBook("carte", "ion", 2013, 199.0)
    val dataBook1 = DataBook("carte", "ion", 2013, 199.0)

    val dataBook2 = dataBook.copy(author = "ilie ion")

    println(book)
    println(dataBook)

    println(dataBook == dataBook1)
    println(book == book2)

    println(dataBook2)

    val (title, author, year, price) = dataBook
    println(title)
    println(price)


    val set = hashSetOf(dataBook, dataBook1, dataBook2)
    val set2 = hashSetOf(book,book2)
    println(set)
    println(set2)
}