class Prime(a:Int) {
    fun isPrime(a: Int): Boolean {
        if (a < 2) return false
        for (i in 2..Math.sqrt(a.toDouble()).toInt()) {
            if (a % i == 0) return false
        }
        return true
    }
}

fun main() {
    print("Nhập một số nguyên: ")
    val a = readLine()?.toIntOrNull()

    if (a != null) {
        val primeChecker = Prime(a)
        if (primeChecker.isPrime(a)) {
            println("Số $a là số nguyên tố.")
        } else {
            println("Số $a không là số nguyên tố.")
        }
    } else {
        println("Thông tin không hợp lệ")
    }
}