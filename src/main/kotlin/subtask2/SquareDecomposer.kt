package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val square = number * number
        return resultCheck(square, number - 1)?.toTypedArray()
    }

    private fun resultCheck(check: Int, limit: Int): ArrayList<Int>? {
        for (i in limit downTo 1) {
            val square = i * i
            if (check - square == 0) {
                return arrayListOf(i)
            }
            if (check - square < 0) {
                return null
            }
            var newLimit = sqrt((check - square).toDouble()).toInt()
            if (newLimit >= i) {
                newLimit = i - 1
            }
            val result = resultCheck(check - square, newLimit)
            if (result != null) {
                result.add(i)
                return result
            }
        }
        return null
    }
}