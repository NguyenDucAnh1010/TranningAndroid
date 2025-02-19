import java.util.Scanner

class Triangle () {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0

    fun nhapThongTin(){
        println("Nhập vào 3 cạnh của tam giác")
        print("x = ")
        var a = readLine()
        if (a!=null)
            this.a=a.toDouble()
        print("b = ")
        var b = readLine()
        if (b!=null)
            this.b=b.toDouble()
        print("c = ")
        var c = readLine()
        if (c!=null)
            this.c=c.toDouble()
    }

    fun tinhChuVi(): Double {
        return if (isTamGiac(a,b,c)) a + b + c else 0.0
    }

    fun tinhDienTich(): Double {
        return if (isTamGiac(a,b,c)) {
            val p = tinhChuVi() / 2
            Math.sqrt(p * (p - a) * (p - b) * (p - c))
        } else 0.0
    }

    fun inThongTin() {
        if (isTamGiac(a,b,c)) {
            println("Tam giác hợp lệ.")
            println("Chu vi: ${tinhChuVi()}")
            println("Diện tích: ${tinhDienTich()}")
        } else {
            println("Ba cạnh không tạo thành tam giác.")
        }
    }
}

fun main() {
    var triangle = Triangle()

    triangle.nhapThongTin()
    triangle.inThongTin()
}
