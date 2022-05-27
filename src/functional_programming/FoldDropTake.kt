package functional_programming

fun main() {
	val list = listOf(1, 2, 3, 4, 5, 6)
	val fold = list.fold('a') { item, current ->
		item + current
	}
	println(fold)
	
	val drop = list.drop(3)
	val dropLast = list.dropLast(2)
	println(drop)
	println(dropLast)
	
	val take = list.take(3)
	val takeLast = list.takeLast(2)
	println(take)
	println(takeLast)
}