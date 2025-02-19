import kotlin.random.Random

fun main() {
    var playAgain: String?

    do {
        val quest = Random.nextInt(0, 101)
        var count = 0
        var check = false

        println("Chào mừng đến với trò chơi Đoán số! Bạn có 5 lần thử.")

        while (count < 5) {
            var guess: Int?
            do {
                print("Nhập một số từ 0-100: ")
                guess = readLine()?.toIntOrNull()
            }while (guess==null)

            count++
            when {
                guess == quest -> {
                    println("Chúc mừng! Bạn đã đoán đúng số $quest.")
                    check = true
                    break
                }
                guess < quest -> println("Số bạn đoán nhỏ hơn số bí mật.")
                else -> println("Số bạn đoán lớn hơn số bí mật.")
            }
        }

        if (!check) {
            println("Bạn đã thua cuộc! Số đúng là $quest.")
        }

        do {
            print("Bạn có muốn chơi lại không? (y/n): ")
            playAgain = readLine()?.lowercase()
        }while (playAgain==null)
    } while (playAgain == "y")

    println("Kết thúc chương trình.")
}