package generic

class ClassGeneric<T, S>(val myName: T, val address: S) {

}

fun main() {
	val classGeneric1 = ClassGeneric("", "")
	val classGeneric2 = ClassGeneric(1, "")
	
	(classGeneric1.myName)
	(classGeneric2.myName)
}