package generic

class FunctionGeneric<T, S>(val myName: T, val address: S) {
	
	fun<T, S> callMyName(myName: T, address: S) {
		println("My name is $myName")
	}
	
}

fun main() {
	val classGeneric1 = FunctionGeneric("", "")
	val classGeneric2 = FunctionGeneric(1, "")
	
	(classGeneric1.myName)
	(classGeneric2.myName)
	
	classGeneric1.callMyName("Kylix", "Malang")
}