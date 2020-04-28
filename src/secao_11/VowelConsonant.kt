package secao_11

fun countVowels(str: String): Int {
    var count: Int = 0
    for (s in str) {
        for (x in arrayOf<Char>('A', 'E', 'I', 'O', 'U')) {
            if (s.equals(x, true)) count++
        }
    }
    return count
}

fun countConsonants(str: String): Int {
    var count: Int = 0
    var vowel: Boolean = false
    for (s in str) {
        for (x in arrayOf<Char>('A', 'E', 'I', 'O', 'U')) {
            if (!s.isLetter() || s.equals(x, true)) {
                vowel = true
            }
        }
        if (!vowel) count++
        vowel = false
    }
    return count
}
