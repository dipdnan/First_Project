import java.util.Date

case class student(name:String,age:Int,start_date:Date)
object Scala_Program_Practice
{
  def main (args : Array[String]): Unit =
  {
    println("Welcome to Scala")
    val currentDate : Date = new Date()
    var c= student("Deepak",22,currentDate)
    println("Student Name : "+c.name)
    println("Student Age :  "+c.age)
    println("Today date :  " +c.start_date)
  }
}
