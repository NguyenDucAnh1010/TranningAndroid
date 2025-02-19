fun main(){
    println("Nhập vào tháng và năm.")
    print("Tháng = ")
    var a = readLine()
    print("năm = ")
    var b = readLine()

    if (a!= null && b!= null){
        var x = a.toInt()
        var y = b.toInt()

        println("Số ngày của tháng $x năm $y là " + when(x){
            1,3,5,7,8,10,12 -> 31
            2 -> if (y%4==0 || y%400==0) 29 else 28
            else -> 30
        })
    }else{
        println("Thông tin không đầy đủ")
    }
}