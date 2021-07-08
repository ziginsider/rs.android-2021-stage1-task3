package subtask2

import kotlin.math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number * number, number - 1)
    }

    private fun decompose(sqrOfN: Int, checkingNumber: Int): Array<Int>? {
        for (x in checkingNumber downTo 1) {
            val sqrNewN = sqrOfN - x * x
            if (sqrNewN == 0) {
                return arrayOf(x)
            }

            val newN = sqrt(sqrNewN.toDouble()).toInt()
            if (newN >= x) {
                return null
            }

            val array = decompose(sqrNewN, newN) ?: continue
            return arrayOf(*array, x)
        }
        return null
    }
}
