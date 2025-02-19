fun isRightTriangle(x: Double,y:Double,z:Double): Boolean{
    return isTriangle(x,y,z) && x*x+y*y>z*z && x*x+z*z>y*y && y*y+z*z>x*x
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
            if (isRightTriangle(a,b,c))
                println("Đây là 3 cạnh của 1 tam giác vuông")
            else
                println("Đây là 3 cạnh của 1 tam giác")
        }else{
            println("Đây là 3 cạnh của 1 tam giác")
        }
    }else{
        println("Thông tin không hợp lệ")
    }
}