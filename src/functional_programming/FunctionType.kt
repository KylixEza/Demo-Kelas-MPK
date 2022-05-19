package functional_programming

fun main() {
	print(myName("Kylix Eza", "Saputra", 19))
}

private typealias CallMyName = (String, String, Int) -> String

private val myName: CallMyName = {firstName, lastName, age -> "My name is $firstName $lastName and I'm $age years old" }
