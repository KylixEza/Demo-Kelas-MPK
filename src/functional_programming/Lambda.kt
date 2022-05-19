package functional_programming

fun main() {
	val myName = callMyName("Kylix Eza", "Saputra", 19)
	println(myName)
}

private val callMyName = {
	firstName: String, lastName: String, age: Int -> "My name is $firstName $lastName and I'm $age years old"
}