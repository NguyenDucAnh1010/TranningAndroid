import kotlin.math.sqrt

fun giaiPTBac2(a:Double,b:Double,c:Double) {
    if (a == 0.0) {
        if (b == 0.0) {
            println(if (c == 0.0) "Phương trình có vô số nghiệm" else "Phương trình vô nghiệm")
        } else {
            val x = -c / b
            println("Phương trình có một nghiệm: x = $x")
        }
    } else {
        val delta = b * b - 4 * a * c
        when {
            delta > 0 -> {
                val x1 = (-b + sqrt(delta)) / (2 * a)
                val x2 = (-b - sqrt(delta)) / (2 * a)
                println("Phương trình có hai nghiệm: x1 = $x1, x2 = $x2")
            }
            delta == 0.0 -> {
                val x = -b / (2 * a)
                println("Phương trình có nghiệm kép: x = $x")
            }
            else -> println("Phương trình vô nghiệm")
        }
    }
}

fun main(){
    println("Nhập các hệ số cuả phương trình ax2 + bx + c = 0.")
    print("a = ")
    var a = readLine()?.toDoubleOrNull()
    print("b = ")
    var b = readLine()?.toDoubleOrNull()
    print("c = ")
    var c = readLine()?.toDoubleOrNull()

    if (a!= null && b!= null && c!= null){
        giaiPTBac2(a,b,c)
    }else{
        println("Thông tin không hợp lệ")
    }
}