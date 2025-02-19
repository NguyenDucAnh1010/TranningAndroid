import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    var playAgain: String

    do {
        val targetNumber = Random.nextInt(0, 101)
        var attempts = 0
        var guessedCorrectly = false

        println("Chào mừng đến với trò chơi Đoán số! Bạn có 5 lần thử.")

        while (attempts < 5) {
            print("Nhập một số từ 0-100: ")
            val guess = scanner.nextInt()
            attempts++

            when {
                guess == targetNumber -> {
                    println("Chúc mừng! Bạn đã đoán đúng số $targetNumber.")
                    guessedCorrectly = true
                    break
                }
                guess < targetNumber -> println("Số bạn đoán nhỏ hơn số bí mật.")
                else -> println("Số bạn đoán lớn hơn số bí mật.")
            }
        }

        if (!guessedCorrectly) {
            println("Bạn đã thua cuộc! Số đúng là $targetNumber.")
        }

        print("Bạn có muốn chơi lại không? (y/n): ")
        playAgain = scanner.next().lowercase()
    } while (playAgain == "y")

    println("Kết thúc chương trình.")
}