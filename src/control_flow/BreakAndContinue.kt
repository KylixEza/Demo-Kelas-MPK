package control_flow

fun main() {
	val arrayOfInt = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
	for (value in arrayOfInt) {
		if (value == 11) {
			break
		}
		if (value % 2 != 0) continue
		println(value)
	}
	
	firstloop@ for (value1 in 1..5) {
		secondloop@ for (value2 in 6..10) {
			if (value2 == 8) {
				break@firstloop
			}
			println(value2)
		}
		println(value1)
	}
}