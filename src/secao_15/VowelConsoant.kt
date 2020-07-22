package secao_15



fun countVowels(str:String): Int{
    val result = str.filter{it.isLetter() && it.toLowerCase() in "aeiou"}.length
    return result;
}

fun countConsonants(str:String): Int{
    val result = str.filter{ it.isLetter() && it.toLowerCase() !in "aeiou"}.length
    return result;
}

