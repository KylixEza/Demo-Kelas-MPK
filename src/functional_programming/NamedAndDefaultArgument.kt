package functional_programming

fun main() {
	val callMyName = callMyName(
		"Kylix Eza",
		age = 19
	)
	
	println(callMyName)
}

private fun callMyName(
	firstName: String = "Abdul",
	lastName: String = "Sutomo",
	age: Int = 34
): String {
	return "My name is $firstName $lastName and I'm $age years old"
}