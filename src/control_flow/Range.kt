package control_flow

fun main() {
	val rangeOneToTen = (10).downTo(1) step 3
	rangeOneToTen.forEach {
		println(it)
	}
	/*if (5 in rangeOneToTen) {
		println("YES")
	} else {
		println("NO")
	}*/
}