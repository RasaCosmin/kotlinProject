package collections

fun main(args: Array<String>) {
    val namToAges = mapOf(Pair("cosmin", 26), Pair("ovi", 25))
    val namToAges1 = mapOf(
            "cosmin" to 26,
            "ovi" to 25
    )

    println(namToAges == namToAges1)

    println(namToAges.keys)
    println(namToAges.values)
    println(namToAges.entries)

    val countryToInhabitants = mutableMapOf(
            "Ro" to 20_000_000
    )
    countryToInhabitants.put("SUA", 21312)
    countryToInhabitants.putIfAbsent("SUA", 21)
    println(countryToInhabitants)
    println(countryToInhabitants.contains("fr"))
    println(countryToInhabitants.containsValue(21))

    println(countryToInhabitants.get("Ro"))
    println(countryToInhabitants.getOrDefault("fr", -1))
}