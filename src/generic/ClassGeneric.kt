package generic

class ClassGeneric(val myName: Any, val address: Any) {

}

fun main() {
	val classGeneric1 = ClassGeneric("", "")
	val classGeneric2 = ClassGeneric(1, "")
	
	(classGeneric1.myName)
	(classGeneric2.myName)
}