fun reverseWords(words: String): String {

    var finalWords = ""
    val wordsArray = "The greatest victory, is that which requires no battle".split(" ")

    for (i in wordsArray.count() - 1 downTo 0) {
        finalWords = finalWords + " " + wordsArray[i]
    }

    return finalWords.trim()

}

fun main() {

    println(reverseWords("The greatest victory is that which requires no battle"))

}