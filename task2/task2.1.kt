package task2_1
import kotlin.collections.*

class Student(var mail: String = "", name: String = "", surname: String = "") {
    
    val regex = """^[a-zA-Z0-9._]+@[a-z]+\.[a-z]{2,6}$""".toRegex()
    var mailIsCorrect = false
    
init
{
    require(mail.isNotBlank() or ( name.isNotBlank() and surname.isNotBlank())) {"you have to input mail or name and surname or all of that"}
     
    if (mail.isNotBlank() and (mail.split("@")[0].length >= 2) and regex.matches(mail)) mailIsCorrect = true

    if (name.isNotBlank() and surname.isNotBlank())
    {

        val fullName = "$name.$surname"

        if (mailIsCorrect)
        {
            println("you've entered correct mail, name and surname. Name and surname are chosen to generate fullName. Inputed mail is employed as object mail")
        } else mail = "$fullName@gmail.com"

        println("built mail is $mail built fullName is $fullName")


    } else if (mailIsCorrect) {
        val fullName = mail.split("@")[0]
        println("of all the input, only mail is correct. mail is $mail fullName is $fullName")

    }
}

    fun equals(b: Student): Boolean {
        return mail == b.mail
    }

    fun hashCode(a: Student): Int {
        var hash = 0
        for(i in 1..(a.mail.length))
        {
            hash += mail[i - 1].code * i
        }
        return hash // наверное надо было использовать sha256
    }
}

fun main() {

    val subjects: List<String> = listOf("PE", "Physics", "Chemistry", "English", "Geography", "History")

    val student1 = Student("ivan.gorodTver@gmail.com", "", "")
    val student2 = Student("Almond.Croissant64@gmail.com", "", "")
    val student3 = Student("five.bottles@gmail.com", "", "")

    val student4 = Student("", "ivan", "gorodTver")
    val student5 = Student("", "Almond", "Croissant64")
    val student6 = Student("", "five", "bottles")

    val students: List<Student> = listOf(student1, student2, student3, student4, student5, student6)

    val studentSubjectDict = mutableMapOf<Student, MutableSet<String>>()
    for (i in students)
    {
        studentSubjectDict[i] = subjects.shuffled().take(3).toMutableSet()
    }
    println(studentSubjectDict)

}

