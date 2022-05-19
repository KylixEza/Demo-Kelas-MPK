package data_class_and_collections

fun main() {
	val immutableSet = setOf(1, 1, 2, 3, 4, 4)
	val mutableSet1 = mutableSetOf(1, 1, 2, 3, 4, 4)
	val mutableSet2 = immutableSet.toMutableSet()
	val list1 = listOf(1, 1, 2, 3, 4, 4).toMutableList()
	
	
}