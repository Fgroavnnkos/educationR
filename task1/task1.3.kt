fun main() {

    val firstString = "omg i love shrek"
    val secondString = "o kek"

    val uniqueSecondChars: MutableSet<Char> = mutableSetOf()
    val firstStringList: MutableList<String> = mutableListOf()

    for (i in secondString) {
        if (i != ' ') {
            uniqueSecondChars.add(i)
            println(i)
        }
    }

    for (i in firstString) {
        firstStringList.add(i.toString())
    }

    for (char in uniqueSecondChars) {
        for (i in 0..firstString.count() - 1) {
            if (firstStringList[i] == char.toString()) {
                firstStringList[i] = char.toString() + char.toString()
            }
        }
    }
    println(firstString)
    println(uniqueSecondChars.joinToString(""))
    println(firstStringList.joinToString(""))


}