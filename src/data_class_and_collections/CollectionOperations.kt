package data_class_and_collections

fun main() {
	val list = listOf(1, 3, 4, 7, 2, 10, 9, 8, 6, 5)
	val userList = listOf(
		User("Kylix", "Malang"),
		User("Abdul", "Bandung"),
		User("Siti", "Surabaya"),
		User("Halim", "Malang"),
		User("Naufal", "Malang"),
		User("Toni", "Surabaya")
	)
	val separatedList = listOf(
		listOf(1, 2, 3),
		listOf(4, 5, 6),
		listOf(7, 8, 9),
	)
	
	val filter = list.filter { it % 2 == 0 }
	val filterNot = list.filterNot { it % 2 == 0 }
	
	val forEach = list.forEach { it % 2 }
	val map = list.map { it % 2 }
	
	val find = list.find { it % 2 == 0 }
	val findLast = list.findLast { it % 2 == 0 }
	
	val first = list.first()
	val last = list.last()
	
	val sum = list.sum()
	
	val sortedAscending = list.sorted()
	val sortedDescending = list.sortedDescending()
	val sortedBy = list.sortedBy { it % 2 == 0 }
	
	val reversed = list.asReversed()
	
	val groupBy = userList.groupBy { it.location }
	
	val takeTop5 = userList.take(5)
	val takeLast5 = userList.takeLast(5)
	val dropTop5 = userList.drop(5)
	val dropLast5 = userList.dropLast(5)
	
	val flatten = separatedList.flatten()
	val chunked = list.chunked(3)
	
	//println(chunked)
	
	//println(flatten)
	
	/*println(takeTop5)
	println(takeLast5)
	println(dropTop5)
	println(dropLast5)*/
	
	//println(groupBy)
	
	/*println(filter)
	println(filterNot)*/
	
	//println(map)
	
	/*println(find)
	println(findLast)*/
	
	/*println(first)
	println(last)*/
	
	//println(sum)
	
/*	println(sortedAscending)
	println(sortedDescending)
	println(sortedBy)*/
	
	//println(reversed)
}

data class User(
	val name: String,
	val location: String,
)