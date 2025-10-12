import java.io.File

//+X (XXX) XXX-XX-XX
//X XXX XXX-XX-XX
//+XXX (XX) XXX-XXXX

fun main() {

    val words = File("text.txt").readText().split(" ")
    val result: MutableList<String> = mutableListOf()


    for (i in 0..words.count() - 1) {
        if ("-" in words[i]) {
            result.add(words[i-2] + " " + words[i-1] + " " + words[i])
        }
    }

    println(result)

}