package functional_programming

fun main() {
	val array = arrayOf(1, 2, 3, 4, 5)
	array.sorted().map {  }.forEach {  }
	
	val myName = "Kylix Eza Saputra"
	myName.callMyName().toHashCode().modByThree
}

fun String.callMyName(): String {
	return "My name is $this"
}

fun String.toHashCode(): Int {
	return this.hashCode()
}

fun Int.modByTwo() {
	println(this % 2)
}

val Int.modByThree
	get() = println(this % 3)

/*
fun callMyName(name: String): String {
	return "My name is $name"
}

fun toHashCode(callMyName: String): Int {
	return callMyName.hashCode()
}

fun modByTwo(hashCode: Int) {
	println(hashCode % 2)
}*/
