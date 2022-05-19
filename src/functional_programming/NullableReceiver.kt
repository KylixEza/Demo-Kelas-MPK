package functional_programming

fun main() {
	val number: Int? = null
	number.timesWithTen()
}

fun Int?.timesWithTen() {
	println(this?.times(10) ?: 0)
}