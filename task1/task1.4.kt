fun main() {

    var num1 = "51232162625165382153876521783518253183528198289098210"
    var num2 = "74763984790384091048387528732498714812138217378273917"
    val result: MutableList<String> = mutableListOf()
    var sum, afterSum
    var num3 = ""

    val gamma = listOf<String>("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")

    if (num1.count() > num2.count()) {
        while (num1.count() > num2.count()){
            num2 = "0" + num2
        }
    } else if (num1.count() < num2.count()) {
        while (num1.count() < num2.count()){
            num1 = "0" + num1
        }
    }

    for (i in num1.count() - 1 downTo 0) {

        sum =  num1[i].digitToInt() + num2[i].digitToInt() + afterSum
        result.add( ( sum % 10 ).toString())
        afterSum =  sum / 10
    }

    if (afterSum != 0) {
        result.add(afterSum.toString())
    }

    for (i in result.count() - 1 downTo 0) {
        num3 = num3 + result[i]
    }
    println(num1)
    println(num2)
    println(num3)

}