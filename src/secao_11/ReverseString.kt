package secao_11

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reversed().toString()
}

fun reverseUsingLoop(str: String): String {
    var reverse = StringBuilder()
    for (x in str.length - 1 downTo 0) {
        reverse.append(str[x])
    }
    return reverse.toString()
}