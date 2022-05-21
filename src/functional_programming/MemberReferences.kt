package functional_programming


private var myName = "Kylix Eza Saputra"

fun main() {
	val range = (1).rangeTo(10)
	val evenNumbers = range.filter(::isEvenNumber)
	range.forEach(::printNumber)
	
	println(::myName.name)
	println(::myName.get())
	::myName.set("My name is ${::myName.get()}")
	println(::myName.get())
}


private fun isEvenNumber(number: Int) = number % 2 == 0

private fun printNumber(number: Int) = println(number)