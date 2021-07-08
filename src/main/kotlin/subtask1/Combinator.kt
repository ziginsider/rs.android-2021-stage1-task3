package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val c = array[0]
        val n = array[1]

        for (i in 1..n) {
            if (combinations(i, n) == c) {
                return i
            }
        }

        return null
    }

    private fun combinations(k: Int, n: Int): Int {
        return (factorial(n) / factorial(k) / factorial(n - k)).toInt()
    }

    private fun factorial(n: Int): Long {
        var ans = 1L
        for (i in 1..n) {
            ans *= i
        }
        return ans
    }
}
