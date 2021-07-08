package subtask3

class TelephoneFinder {
    private val digitsNeighbors = mapOf(
        '0' to arrayOf('8'),
        '1' to arrayOf('2', '4'),
        '2' to arrayOf('1', '3', '5'),
        '3' to arrayOf('2', '6'),
        '4' to arrayOf('1', '5', '7'),
        '5' to arrayOf('2', '4', '6', '8'),
        '6' to arrayOf('3', '5', '9'),
        '7' to arrayOf('4', '8'),
        '8' to arrayOf('5', '7', '9', '0'),
        '9' to arrayOf('6', '8')
    )

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.isEmpty() || number[0] == '-') {
            return null
        }

        val res = mutableListOf<String>()

        for ((index, numeral) in number.withIndex()) {
            val mutableNumber = StringBuilder(number)
            digitsNeighbors[numeral]?.forEach {
                mutableNumber[index] = it
                res.add(mutableNumber.toString())
            }
        }

        return res.toTypedArray()
    }
}
