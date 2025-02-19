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
    var a = readLine()
    print("b = ")
    var b = readLine()

    if (a!= null && b!= null){
        var x = a.toInt()
        var y = b.toInt()

        val z = UCLNBCNN(x, y)
        z.inThongTin()
    }else{
        println("Thông tin không đầy đủ")
    }
}

