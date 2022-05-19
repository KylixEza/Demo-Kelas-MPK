package control_flow

fun main() {
	val arrayOfInt = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
	/*for (value in arrayOfInt) {
		println(value)
	}*/
	/*arrayOfInt.forEach { value ->
		println(value)
	}*/
	arrayOfInt.forEachIndexed { index, value ->
		println("$value is at index number $index")
	}
}