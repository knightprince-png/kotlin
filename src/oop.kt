fun main() {
    var doctor1=Person()
    println(doctor1.name)
    doctor1.speak()


}

class Person{
    var name = "jane"
    var age=34
    var department="department 1"

    fun speak(){
        println("Doctor is speaking")
    }
}