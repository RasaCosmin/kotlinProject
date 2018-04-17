package io

import java.io.File

fun main(args: Array<String>) {
    val ipMap = mutableMapOf<String, Int>()

    File("src/ips.txt").forEachLine {
        val count = ipMap.getOrDefault(it, 0)
        ipMap[it] = count + 1
        /*if (!ipMap.containsKey(it)) {
            ipMap[it] = 1
        } else {
            ipMap[it] = ipMap[it]!! + 1
        }*/
    }

    val (maxIp, maxCount) = ipMap.entries.maxBy { it.value }!!

    if (ipMap.isNotEmpty()) {
        var mostFrequentIp = ipMap.entries.first().key
        var mostFrequent = ipMap.entries.first().value

        for (ip in ipMap.entries) {
            if (ip.value > mostFrequent) {
                mostFrequentIp = ip.key
                mostFrequent = ip.value
            }
        }

        println(mostFrequentIp)
    } else {
        println("the ip list is empty")
    }
}