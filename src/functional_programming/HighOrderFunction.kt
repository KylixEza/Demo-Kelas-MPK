package functional_programming

fun main() {
	
	callMyName({ name, age ->
		if (name == "Kylix Eza") {
			return@callMyName "My name is $name and I'm $age years old"
		} else {
			return@callMyName "I dunno who is that"
		}
	}, 72.0)
	
}

private inline fun callMyName(action: (String, Int) -> String, weight: Double) {
	val callMyName = action("Kylix Eza", 19)
	println(callMyName)
}