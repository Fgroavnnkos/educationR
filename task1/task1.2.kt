fun main() {

    val string = " slovo, skdsdsks sdsaowq! Cogito, Ergo Sum."
    val specialCharactersList = listOf(" ", "!", "?", ",", ".", "(", ")")

    var wordLength: Double = 0.0
    var lengthList = mutableListOf<Double>()

    for (i in string) {
        if (i.toString() !in specialCharactersList) {
            wordLength++
            } else {
                if (wordLength != 0.0) {
                    lengthList.add(wordLength)
                }
                wordLength = 0.0
            }
    }

    if (wordLength != 0.0) {
        lengthList.add(wordLength)
    }

    val result: Double = lengthList.sum() / lengthList.count()
    println(lengthList)
    println(result)

}