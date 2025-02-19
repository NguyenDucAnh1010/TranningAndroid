class Triangle () {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0

    fun enterValue(){
        println("Nhập vào 3 cạnh của tam giác")
        print("x = ")
        var a = readLine()?.toDoubleOrNull()
        if (a!=null)
            this.a=a
        print("b = ")
        var b = readLine()?.toDoubleOrNull()
        if (b!=null)
            this.b=b
        print("c = ")
        var c = readLine()?.toDoubleOrNull()
        if (c!=null)
            this.c=c
    }

    fun perimerter(): Double {
        return if (isTriangle(a,b,c)) a + b + c else 0.0
    }

    fun area(): Double {
        return if (isTriangle(a,b,c)) {
            val p = perimerter() / 2
            Math.sqrt(p * (p - a) * (p - b) * (p - c))
        } else 0.0
    }

    fun printInfo() {
        if (isTriangle(a,b,c)) {
            println("Tam giác hợp lệ.")
            println("Chu vi: ${perimerter()}")
            println("Diện tích: ${area()}")
        } else {
            println("Ba cạnh không tạo thành tam giác.")
        }
    }
}

fun main() {
    var triangle = Triangle()

    triangle.enterValue()
    triangle.printInfo()
}
