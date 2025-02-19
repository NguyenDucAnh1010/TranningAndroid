class UCLNBCNN(var a: Int, var b: Int) {

    fun UCLN(x: Int, y: Int): Int {
        return if (y == 0) x else UCLN(y, x % y)
    }

    fun UCNN(): Int {
        return (a * b) / UCLN(a, b)
    }

    fun inThongTin() {
        println("Ước chung lớn nhất của $a và $b là: ${UCLN(a, b)}")
        println("Bội chung nhỏ nhất của $a và $b là: ${UCNN()}")
    }
}

fun main(){
    print("a = ")
    var a = readLine()?.toIntOrNull()
    print("b = ")
    var b = readLine()?.toIntOrNull()

    if (a!= null && b!= null){
        val z = UCLNBCNN(a, b)
        z.inThongTin()
    }else{
        println("Thông tin không hợp lệ")
    }
}

