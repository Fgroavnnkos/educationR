import java.io.File

//+X (XXX) XXX-XX-XX +7 (921) 345-67-89
//X XXX XXX-XX-XX
//+XXX (XX) XXX-XXXX +375 (34) 444-7843

fun main() {

    val result: MutableList<String> = mutableListOf()
    val conversation = File("text.txt").readText()
    val patterns = mutableListOf(
    "\\+[1-9][1-9][1-9] \\([1-9][1-9]\\) [1-9][1-9][1-9]-[1-9][1-9][1-9][1-9]".toRegex(RegexOption.IGNORE_CASE),
    "(\\+|)[1-9] \\([1-9][1-9][1-9]\\) [1-9][1-9][1-9]-[1-9][1-9]-[1-9][1-9]".toRegex(RegexOption.IGNORE_CASE)
    )

    println(conversation)


    for (pattern in patterns) {

        if (pattern.containsMatchIn(conversation)) {

            result.add(pattern.find(conversation)?.value ?: "wrong value in .find")

        }
    }
    
    println(result)

}