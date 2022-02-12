package kotlinPrograms

fun printName(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach {
        itemsToGreet->
        println("$greeting $itemsToGreet")
    }

}

fun greeetPerson(greet:String, name : String) = println("$greet $name")


fun main(){
    val person = Person("kajal","Rani")
    person.firstName
    person.firstName







}