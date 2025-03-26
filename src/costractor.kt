fun main() {
    var dog1=Dog("Billy","Chihuahua","Brown")
    var dog2=Dog("Mike","Kienyeji","Brown")
    var dog3=Dog("Joseph","German shepherd","Brown")
    var dog4=Dog("Ian","Siberian Husky","White")

    println(dog1.breed)
    println(dog2.name)
    println(dog3.breed)

}

class Dog(var name: String,var breed:String,var color:String){

}