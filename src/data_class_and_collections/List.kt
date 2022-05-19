package data_class_and_collections

fun main() {
	val immutableList = listOf(1, 2, 3, 4)
	val mutableList1 = mutableListOf(1, 2, 3, 4)
	val mutableList2 = immutableList.toMutableList()
	val arrayList = arrayListOf(1, 2, 3, 4)
	
	mutableList2.add(1, 5)
	mutableList2.remove(5)
	mutableList2.forEach {
		println(it)
	}
}