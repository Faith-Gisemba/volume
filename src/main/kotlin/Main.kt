fun main(){

    val division = division(144,12,6)
    println(division)
    greetPerson("Annet","Pauline")
    val sum = sum(45,78,97)
    print(sum)
    val volume = volumeOfCylinder(1,0,2)
    println(volume)
}
fun division(num1:Int,num2:Int,num3:Int):Int{
    val division = (num1 / num2 /num3)
    return(division)
}
//Greet Person
fun greetPerson(name1:String,name2:String){
    println("Hello $name1 and $name2 ,trusting you are doing well,just wanted to motivate you to keep going")
}
//Addition
fun sum(x:Int,y:Int,z:Int):Int {
    val sum = (x + y + z)
    return (sum)
}
fun volumeOfCylinder(length: Int,width: Int,height: Int):Int{
    val volume = (length * width * height)
    return(volume)

}