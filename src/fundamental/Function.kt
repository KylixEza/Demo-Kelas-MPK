package fundamental

fun main() {
	/*val fx = f(2)
	val gx = g(2)
	println(fx + gx)*/
	val gx = g(2, 3)
	print(gx)
}

fun f(x: Int): Int = 2 * x + 3

fun g(x: Int, y: Int): Int {
	println(x)
	println(y)
	return 3 * x + 1 + 2 * y
}