package functional_programming

fun main() {
	val array = arrayOf(100, 200, 300)
	mathOperation(1, 2, 3, 4, 5, 6, 7 , 8, 9, name = "Kylix")
}

private fun mathOperation(vararg numbers: Int, name: String) {
	for (number in numbers) {
		println(number)
	}
}