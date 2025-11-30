package task2_1

import kotlin.random.Random
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

class C(val i: Int)

data class S(val i: Int)

fun main() {

    println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024)
    val intArr = ((1..100000).map { Random.nextInt() }).toIntArray() // раньше экземпляр Random создавался бы для каждой итерации, но начиная с версии kotlin 1.3, Random создастся только один раз
    println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024)
    val classArr = ((1..100000).map {C(Random.nextInt())}).toTypedArray()
    println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024)
    val dataClassArr = ((1..100000).map {S(Random.nextInt())}).toTypedArray()
    println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024)

    val intArrSortTime = measureTimeMillis {
        intArr.sort()
    }
    println(intArrSortTime)

    val classArrSortTime = measureTimeMillis {
        classArr.sortBy { it.i }
    }
    println(classArrSortTime)

    val dataClassArrSortTime = measureTimeMillis {
        dataClassArr.sortBy { it.i }
    }
    println(classArrSortTime)

}