fun main(){
    print("a = ")
    var a = readLine()
    print("b = ")
    var b = readLine()
    print("ch = ")
    var ch = readLine()

    if (a!= null && b!= null && ch!= null){
        var x = a.toDouble()
        var y = b.toDouble()

        println("Kết quả: "+when (ch){
            "+" -> x+y
            "-" -> x-y
            "*" -> x*y
            "/" -> x/y
            else -> "không hợp lệ"
        })
    }else{
        println("Thông tin không đầy đủ")
    }
}