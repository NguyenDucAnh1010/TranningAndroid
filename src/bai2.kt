fun isTriangle(x: Double,y:Double,z:Double): Boolean{
    return x+y>z && x+z>y && y+z>x
}

fun main(){
    println("Nhập vào 3 cạnh của tam giác")
    print("a = ")
    var a = readLine()?.toDoubleOrNull()
    print("b = ")
    var b = readLine()?.toDoubleOrNull()
    print("c = ")
    var c = readLine()?.toDoubleOrNull()

    if (a!= null && b!= null && c!= null){
        if (isTriangle(a,b,c)){
            println("Đây là 3 cạnh của 1 tam giác")
        }else{
            println("Đây là 3 cạnh của 1 tam giác")
        }
    }else{
        println("Thông tin không hợp lệ")
    }
}