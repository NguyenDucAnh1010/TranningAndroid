fun main(){
    println("Nhập vào tháng và năm.")
    print("Tháng = ")
    var a = readLine()?.toIntOrNull()
    print("năm = ")
    var b = readLine()?.toIntOrNull()

    if (a!= null && b!= null){
        println("Số ngày của tháng $a năm $b là " + when(a){
            1,3,5,7,8,10,12 -> 31
            2 -> if (b%4==0 || b%400==0) 29 else 28
            else -> 30
        })
    }else{
        println("Thông tin không hợp lệ")
    }
}