package loops

fun main(args: Array<String>) {
    val array = arrayListOf("Alba", "Cluj", "Sibiu", "Timisoara", "Bucuresti")
    for (jud in array) {
        if (!jud.contains('a') && !jud.contains('j')) {
            continue
        }
        for (c in jud) {
            println(c)
        }

    }

}