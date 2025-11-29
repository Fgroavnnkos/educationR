package task2_1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun equalsTest() {
        val student1 = Student("ivan.gorodTver@gmail.com")
        val student2  = Student("", "ivan", "gorodTver")
        val student3  = Student("sahdsahdusahdopsahdposajpid", "Almod", "Croissant64")

        val result12 = student1.equals(student2)
        val result13 = student1.equals(student3)
        val result23 = student2.equals(student3)

        Assertions.assertEquals(true, result12)
        Assertions.assertEquals(false, result13)
        Assertions.assertEquals(false, result23)
    }

    @Test
    fun hashCodeTest() {
        val student1  = Student("ivan.gorodTver@gmail.com")
        val student2  = Student("", "ivan", "gorodTver")
        val student3  = Student("", "Almod", "Croissant64")

        val result12 = (student1.hashCode() == student2.hashCode())
        val result13 = (student1.hashCode() == student3.hashCode())
        val result23 = (student2.hashCode() == student3.hashCode())

        Assertions.assertEquals(true, result12)
        Assertions.assertEquals(false, result13)
        Assertions.assertEquals(false, result23)
    }

    @Test
    fun subjectMutableSetLenghtTest() {

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

        for (i in students)
        {
            Assertions.assertEquals(3, studentSubjectDict.get(i)?.size)
        }

    }

}