fun main(){
    print("Nhập x là số nguyên: ")
    var x = readLine()
    if (x != null) {
        if (x.toInt()>=0)
            println("Đây là số nguyên dương")
        else
            println("Đây là số nguyên âm")
    }else{
        println("Bạn ko nhập gì cả")
    }
}