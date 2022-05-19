package functional_programming

fun main() {
	/*val stringBuilder = StringBuilder()
	stringBuilder.apply {
		append("My name is")
		append("Kylix Eza Saputra")
		append("and I'm 19 years old")
	}*/
	
	callMyName {
		append("My name is ")
		append("Kylix Eza Saputra ")
		append("and I'm 19 years old")
		toString()
	}
}

private fun callMyName(action: StringBuilder.() -> String) {
	val stringBuilder = StringBuilder()
	val myName = stringBuilder.action()
	println(myName)
}