package data_class_and_collections

fun main() {
	val dataClassUser1 = DataClassUser("kylix", 19)
	val dataClassUser2 = DataClassUser("kylix", 19)
	val dataClassUser3 = dataClassUser1.copy("abdul")
	
/*	val name = dataClassUser1.component1()
	val age = dataClassUser1.component2()*/
	
	val (name, age) = dataClassUser1
	
	val classUser1 = ClassUser("kylix", 19)
	val classUser2 = ClassUser("kylix", 19)
	
	/*println("Data Class: $dataClassUser")
	println("Class: $classUser")*/
	
	/*println(dataClassUser1 == dataClassUser2)
	println(classUser1 == classUser2)*/
	
	//println(dataClassUser3)
	
	println(name)
	println(age)
}

data class DataClassUser(
	val name: String,
	val age: Int,
)

class ClassUser(
	val name: String,
	val age: Int
) {
	override fun toString(): String {
		return "ClassUser(name=$name, age=$age)"
	}
}