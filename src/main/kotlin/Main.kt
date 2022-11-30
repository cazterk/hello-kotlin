fun main(args: Array<String>) {
    print10Numbers()
    val x = isEven(5)
    val y = 3
    println(x)
    println(y.isOdd())

    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

    // anonymous class
    val bear = object: Animal("Bear"){
        override fun makeSound() {
            println("I'm a bear!")
        }
    }

    // lambda function
    val list = listOf("kotlin", "is" , "fun")
    val count= list.customCount{currentString ->
        currentString.length >= 3
    }
    println(count)

    // try catch all exceptions
    val number = readLine() ?: "0"
    val parsedNumber= try{
        number.toInt()
    }catch (e:Exception){
        0
    }
    println(parsedNumber)


}

fun <T>List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}
fun Int.isOdd(): Boolean {
    return this % 2==1
}

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

fun print10Numbers(){
    for (i in 1..10) {
        println(i)
    }
}