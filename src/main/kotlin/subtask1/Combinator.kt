package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        if (m < 0 || n <= 0) {
            return null
        }
        for (i in 0..n) {
            if (factorial(n) == m * factorial(n - i) * factorial(i)) {
                return i
            }
        }
        return null
    }

    private fun factorial(n: Int): Double {
        var result = 1.0
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}

