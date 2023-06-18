

fun main() {
sumOfNumbers()
    val people = listOf(
        Person("Becky",29,5.4,56.0),
        Person("Annet",49,5.7,60.0),
        Person("Norah",26,5.5,54.2)
    )
    val sortedPeople = people.sortedByDescending { it.age }


    println(sortedPeople)

    takesNames("Joy", "Peace", "Patience")
    println(takesNames("Joy", "Peace", "Patience"))
    val cars= listOf(
        Car("T256yu6",200.0),
        Car("tyu3786",300.0),
        Car("rty4567",400.0)
    )
    val averageMileage = calculateTotalMileage(cars)
    println("The toal mileage fo the cars is $averageMileage km.")

    var occur =CurrentAccount("123456789","Nakachwa",4000.0)
    println(occur.deposit(3000.0))
    println(occur.withdraw(1000.0))
    occur.details()

    println(getString("Interesting"))
    println(getArray(arrayOf()))
    getGrades(listOf())


    println(getVowels(charArrayOf('b','a','c','d','i','j')))

    println(isPasswordValid("2023"))
    println(isPasswordValid("password"))
    println(isPasswordValid("abcde123"))

    getMultiples()
    println(getEvenIndices(listOf("ant","hoses","back","t","d","r","u","p","d")))
    println( getTheAverageHeightAndTotalHeight(listOf(10.0,20.0,30.0,40.0,50.0,60.0)))

    val crudentials =Persons("John",23,1.3F,56.0)
    getCrudentials()

    //nollywood movie
    val filmProject = FilmProject(
        mutableListOf(
            Movie("Movie 1", listOf("Actor 1", "Actor 2"), "Schedule 1", 100000.0),
            Movie("Movie 2", listOf("Actor 3", "Actor 4"), "Schedule 2", 150000.0)
        )
    )

    filmProject.addMovie(Movie("Movie 3", listOf("Actor 1", "Actor 4"), "Schedule 3", 120000.0))
    filmProject.removeMovieByTitle("Movie 1")
    val movie = filmProject.getMovieByTitle("Movie 2")
    val totalMoviesOrdered = filmProject.calculateTotalMoviesOrdered()
    val totalMoviesPresent = filmProject.calculateTotalMoviesPresent()

    // Perform other operations as needed

 var ankara=Ankara("curly")
    ankara.predictDesign(40.00,"Happy")
    ankara.predictDesign(60.00,"sad")

    var ankaras =Ankaras("dotted")
    println(ankaras.predictChanges(24.0,"sad"))
    println(ankaras.predictChanges(19.0,"happy"))


    var drum1 = Drum("wood","small")
    drum1.makeSound("clap")
    var drum2 = Djembe("furniture","medium")
    drum2.makeSound("low")
    var drum3 = TalkingDrum("paper","big")
    drum3.mimicSpeech("high")
    drum3.wideRangeTones("very high")
    var drum4 = Bougarabou("animal skin","very big")
    drum4.deepRichBase("extremely high")





}
//Lists assignment1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)

fun sumOfNumbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1] +numbers[4])
    //(ii) prints out the index of 158 (1 point)
    println(numbers.indexOf(158))
    //(iii) prints out the elements in ascending order. (1 point)
    println(numbers.sortedArray().contentToString())
}
//2. Given a list of Person objects, each with the attributes, name, age, height,
// and weight. Sort the list in order of descending age (2 points)

data class Person(var name:String, var age:Int, var height:Double, var weight:Double)

//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun takesNames(num1:String,num2:String,num3:String):String{
    var names = arrayOf( num1,"" + num2,"" + num3)
    return (names.contentToString())
}
//4. Write a function that takes in a list of Car objects each with a registration
// and mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
class Car(var registration:String, var mileage:Double)

fun calculateTotalMileage(cars:List<Car>):Double{
   var totalMileage =0.0
    for (car in cars){
        totalMileage+=car.mileage
    }
    return totalMileage/cars.size

}

//Create a kotlin class CurrentAccount with the following
// attributes: account number, account name. balance . It has the following functions.
//deposit(amount:Double)-Increments the balance by the amount deposited
//withdraw(amount:Double)-Decrements the balance by the amount withdrawn
//details() -   prints out the account number and balance and name in this format:
// "Account number x with balance y is operated by z


 open class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Double){

    fun deposit(amount:Double):Double{
        var deposit = balance + amount
        deposit+=amount
        return deposit
    }
    open fun  withdraw(amount: Double):Double{
       var withdraw= balance - amount
       withdraw-=amount
       return withdraw
   }
    // "Account number x with balance y is operated by z
    fun details(){
        println("The  account number ${accountNumber} of balance ${balance} belongs to ${accountName}")
    }
}
//Using OOP a kotlin create  a Savings Account inheriting from the Current Account  class
 //but performs a withdrawal methode and a person can only withdraw if they have
 //only withdrawn less than 4 times else they are not eligible to withdraw from their account.
class SavingsAccount( accountNumber:String, accountName:String,  balance:Double,var withdrawals:Int):
        CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double): Double {
        if (withdrawals<4){
        return super.withdraw(amount)
        withdrawals++
    }
        else{
            println("Your not eligible")
        }

  return (withdraw(4000.0))
        }
        }

  //write a kotlin program that given a string returns a string
// containing all the characters at even indices.
fun getString(str:String):String{
    var results = ""
      for (i in str.indices step 2){
           results+=str[i]
      }
      return results

}
//write a kotlin program that takes in an array of strings,
// joins them all into one string and returns it

fun getArray(name:Array<String>):String{
  val getArrays = arrayOf("Hello","Home","Becky")
    val getResults = getArrays.joinToString("")
    return (getResults)


    }
//You have a list of student's grades. Write a program that calculates
// the average grade of all the students the list and prints the results
 fun getGrades(grad:List<Int>){
     var grades = listOf(1,2,3,4,5,6)
    var average=grades.average()
    println(average)
 }
//write a kotlin function that takes an array of characters as input
// and returns the number of vowels present in the array
fun getVowels(char:CharArray): Int{
    var vowels = "AEIOUaeiou"
    var count = 0
    for ( char in char){
        if (vowels.contains(char)){
            count++
    }
}
    return count


    }
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
class AnalysingString(val firstChar:Char, val lastChar:Char, val length:Int,val getVowel:Boolean){
    fun getAnalysedString(inside:String): AnalysingString {
        val firstChar = inside.first()
        val lastChar = inside.last()
        val length = inside.length
        val getVowel = inside.startsWith("a") || inside.startsWith("e") || inside.startsWith("i")
                || inside.startsWith("o") || inside.startsWith("u")
        return AnalysingString(firstChar,lastChar,length,getVowel)
    }
}



//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun isPasswordValid(password:String):Boolean{
    val minlength = 8;
    val maxlength = 16
    if (password.length < minlength || password.length> maxlength){
        return false

        }
    if (password =="password"){
        return false
    }
    if(!password.any {it.isDigit()}){
        return false
    }
    return true


    }

//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun getMultiples(){
  for (i in 1..100){
      if(i %6==0 || i %8==0){
          println("Bingo")
      }
      else if (i %8==0){
          println("multiple of eight")
      }
      else if(i %6==0){
        println("multiple of 6")

  }
}


    }
//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices  index 2,4,6  (2 points)
fun getEvenIndices(strings:List<String>):List<String>{
    val results = mutableListOf<String>()
    for (i in 2..6 step 2){
        results.add(strings[i])
    }
    return results
}
//
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun getTheAverageHeightAndTotalHeight(height: List<Double>):Double{
    val totalHeight = height.sum()
    val averageHeight = totalHeight/height.size
    return averageHeight
}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Persons(var name:String, var age:Int, var height:Float, var weight:Double)
fun getCrudentials(){
    val child = Persons("jon",40,1.9F,56.0)
    val woman = Persons("hey",30,1.5F,60.0)
    val girl = Persons("winnie",20,1.7F,40.0)
    val allPeople = listOf(child,woman,girl)
    val sortedPeople = allPeople.sortedByDescending { allPeople ->allPeople.age }
    println(sortedPeople)

}

//
//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

class Movie(val title: String, val cast: List<String>, val shootingSchedule: String, val budget: Double)

class FilmProject(val movies: MutableList<Movie>) {
    fun addMovie(movie: Movie) {
        movies.add(movie)
    }

    fun removeMovieByTitle(title: String) {
        val movie = movies.find { it.title == title }
        movie?.let { movies.remove(it) }
    }

    fun getMovieByTitle(title: String): Movie? {
        return movies.find { it.title == title }
    }

    fun calculateTotalMoviesOrdered(): Int {
        return movies.size
    }

    fun calculateTotalMoviesPresent(): Int {
        return movies.count()
    }
}
class Ankara(private var design:String){
    fun predictDesign(temperature:Double,mood:String){
        if(temperature <= 50.00 && mood=="happy"){
           println("$design changed to red")
        }
        else{
            println("$design did not change")
        }
    }
}


class Ankaras(var designPatterns:String){
    fun predictChanges(temperatures: Double,moods: String):String{
        if(temperatures <=20.0  && moods =="happy"){
            return ("$designPatterns changed to floral")
        }
        else if (temperatures > 20.0 && moods =="sad"){
            return ("$designPatterns changed to wavy")
        }
        else{
            return("$designPatterns was retained")
        }
    }
}


 open class Drum(var material:String, var size:String){
     open fun makeSound(tone:String){
        println("make $tone sound")
    }
}
class Djembe(matertial:String, size:String):Drum(matertial,size){
    override fun makeSound(tone: String) {
        println("makes $tone sound")
    }
}
class TalkingDrum(material: String,size: String):Drum(material, size){
    override fun makeSound(tone: String) {
        println("makes $tone sounds")
    }
    fun mimicSpeech(tone: String){
        println("mimic human speech")
    }
    fun wideRangeTones(tone: String){
        println("wide range of $tone tones")
    }

}
class Bougarabou(material: String,size: String):Drum(material, size){
    fun deepRichBase(tone: String){
        println("contains deep rich $tone sounds ")
    }

}
//class MagicalFruitTree(val powers:String, val name:String, val effects:String, val season:String){
//    override fun toString(): String {
//        return "$powers $name $effects $season"
//    }
//
//
//
//
//      }
//val emptyList = mutableListOf<MagicalFruitTree>()
//val fruit = MagicalFruitTree( "changes color",   "strength",  "baobob fruit",   "dry") { }
//    emptyList.add(fruit)
//
//println(fruit)
//println(emptyList)





