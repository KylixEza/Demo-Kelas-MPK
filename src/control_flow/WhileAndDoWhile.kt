package control_flow

fun main() {
	drawStars(5)
}

fun drawStars(height: Int) {
	var count = 0
	/*while (count != height) {
		println("*")
		count++
	}*/
	
	do {
		println("*")
		count++
	} while (count != height)
}