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