fun isTamGiac(x: Double,y:Double,z:Double): Boolean{
    return x+y>z && x+z>y && y+z>x
}

fun main(){
    println("Nhập vào 3 cạnh của tam giác")
    print("a = ")
    var a = readLine()
    print("b = ")
    var b = readLine()
    print("c = ")
    var c = readLine()

    if (a!= null && b!= null && c!= null){
        var x = a.toDouble()
        var y = b.toDouble()
        var z = c.toDouble()

        if (isTamGiac(x,y,z)){
            println("Đây là 3 cạnh của 1 tam giác")
        }else{
            println("Đây là 3 cạnh của 1 tam giác")
        }
    }else{
        println("Thông tin không đầy đủ")
    }
}