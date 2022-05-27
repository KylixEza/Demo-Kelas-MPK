package functional_programming

fun main() {
	val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	val slice = list.slice((3..6).step(2))
	println(slice)
	
	val users = listOf(
		User("Kylix", 19),
		User("Joko", 23),
		User("Abdul", 22),
		User("Siti", 31),
		User("Siti", 29)
	)
	val duplicateValueList = listOf(1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 6)
	
	val distinct = duplicateValueList.distinct()
	val userDistinct = users.distinct()
	val userDistinctByName = users.distinctBy { it.username }
	
	println(distinct)
	println(userDistinct)
	println(userDistinctByName)
	
	val chunked = list.chunked(4)
	val chunkedTransform = list.chunked(4) { list ->
		list.map { it + 2 }
	}
	
	println(chunked)
	println(chunkedTransform)
	
	/*val take = list.take(3)
	println(take)*/
}

data class User(
	val username: String,
	val age: Int
)