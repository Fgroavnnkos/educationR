fun main() {

    val firstString = "omg i love shrek"
    val secondString = "o kek"

    var uniqueSecondChars: MutableSet<Char> = mutableSetOf()
    var firstStringList: MutableList<String> = mutableListOf()

    for (i in secondString) {
        if (i.toString() != " ") {
            uniqueSecondStrings.add(i)
            println(i)
        }
    }

    for (i in firstString) {
        firstStringList.add(i.toString())
    }

    for (char in uniqueSecondStrings) {
        for (i in 0..firstString.count() - 1) {
            if (firstStringList[i] == char.toString()) {
                firstStringList[i] = char.toString() + char.toString()
            }
        }
    }
    println(firstString)
    println(uniqueSecondStrings.joinToString(""))
    println(firstStringList.joinToString(""))


}