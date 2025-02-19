fun main(){
    print("Nhập x là số nguyên: ")
    var x = readLine()?.toIntOrNull()
    if (x != null) {
        if (x.toInt()>=0)
            println("Đây là số nguyên dương")
        else
            println("Đây là số nguyên âm")
    }else{
        println("Thông tin không hợp lệ")
    }
}