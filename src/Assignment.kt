fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(getEvenNumbersAverage(array))

    println(isPalindrome("Malayalam"));
}

fun getEvenNumbersAverage(array: Array<Int>): Int {
    var sum = 0

    for (item in array.indices) {
        if (item % 2 == 0)
            sum += array[item]
    }

    return sum / (array.size / 2)
}

fun isPalindrome(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)
    val reverseStr = sb.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}
