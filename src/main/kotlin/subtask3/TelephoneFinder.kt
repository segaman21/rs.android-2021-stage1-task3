package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.toInt() < 0) return null
        val result = mutableSetOf<String>()
        val phoneNumber = mapOf(
            '0' to arrayListOf('8'),
            '1' to arrayListOf('2', '4'),
            '2' to arrayListOf('1', '3', '5'),
            '3' to arrayListOf('2', '6'),
            '4' to arrayListOf('1', '5', '7'),
            '5' to arrayListOf('2', '4', '6', '8'),
            '6' to arrayListOf('3', '5', '9'),
            '7' to arrayListOf('4', '8'),
            '8' to arrayListOf('0', '5', '7', '9'),
            '9' to arrayListOf('6', '8')
        )

        number.forEachIndexed { i, num ->
            phoneNumber[num]?.forEach {
                result.add(number.substring(0, i) + it + number.substring(i + 1))
            }
        }
        return result.toTypedArray()
    }
}

