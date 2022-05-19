package fundamental

fun main() {
	val array1 = arrayOf(1, 2, 3, 4, 5, 6).toMutableList()
	val array2 = arrayOf(1, 2.1, "Name", true, arrayOf(1, 2, 3, 4, 5).toList()).toMutableList()
	
	val array3 = mutableListOf<Any>()
	
	println(array1.toList())
	println(array2.toList())
	
	/*array1.forEach {
		println(it)
	}*/
	println(array1[0])
	array1.add(2, 100)
	println(array1.toList())
}