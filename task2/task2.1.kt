fun main() {
    
class Student(val email: String) {

    val fullName: String = email.split("@")[0]

}

val student1 = Student("123321@mail.lol")
println(student1.fullName)

}