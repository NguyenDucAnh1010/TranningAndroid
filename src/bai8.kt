fun main() {
    print("a = ")
    var a = readlnOrNull()?.toDoubleOrNull()
    print("b = ")
    var b = readlnOrNull()?.toDoubleOrNull()
    print("ch = ")
    var ch = readlnOrNull()

    if (a != null && b != null && ch != null) {
        println(
            "Kết quả: " + when (ch) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                else -> "không hợp lệ"
            }
        )
    } else {
        println("Thông tin không hợp lệ")
    }
}