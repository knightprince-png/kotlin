fun main() {
    //standard library function/predefined function
    var x =Math.sqrt(144.0)
    println("The square root of 144 is $x")

    var y=Math.round(45.45)
    println("The output is $y")

    school()
    student("IanJoseph",34)
    student("",23)
    employee("Mark",70000,false)
    employee("Ann",130000,false)
}

//user defined functions
fun school(){
     println("Emobilis")
}

//parameter/variable and argument/value
fun student(name:String,age:Int){
    println("$name is $age years old")
}

fun employee(name: String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Disability: $disability")

}