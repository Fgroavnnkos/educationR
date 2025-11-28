package task2_1

import org.jetbrains.annotations.Nullable

class Student() {
 init {

 }
    var _mail = ""
    var _name = ""
    var _surname = ""

    constructor(
        mail: String,
        name: String,
        surname: String,
    ): this()
    {
         if (name.isNotBlank() and surname.isNotBlank())
        {
            _name = name
            _surname = surname
            val fullName =  "$_name.$_surname" // Можно было записать как _name + '.' + _surname, но мне показалось, что использованный вариант лучше читается
            _mail = "$fullName@gmail.com"
            return
        } else if(mail.isNotBlank() and ("@" in mail) and (mail.split("@")[0].length >= 2))
        {
            _mail = mail
            val fullName = mail.split("@")[0]


        } else

    }
}
    fun equals(a: Student): Boolean {

        if (mail == a.mail)
        {
            return true
        } else return false

    }

    fun hashCode(a: Student, b: Student): Boolean {

    }
}
fun main() {

    val student = Student("ivan", "gorodTver")

    println(student.mail)

}