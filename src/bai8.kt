fun main(){
    print("a = ")
    var a = readLine()?.toDoubleOrNull()
    print("b = ")
    var b = readLine()?.toDoubleOrNull()
    print("ch = ")
    var ch = readLine()

    if (a!= null && b!= null && ch!= null){
        println("Kết quả: "+when (ch){
            "+" -> a+b
            "-" -> a-b
            "*" -> a*b
            "/" -> a/b
            else -> "không hợp lệ"
        })
    }else{
        println("Thông tin không hợp lệ")
    }
}