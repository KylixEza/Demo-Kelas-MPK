package functional_programming

fun main() {
	sum(1, 2, 3)
	sum(null, 5, 8)
}

private fun sum(valueA: Int?, valueB: Int?, valueC: Int?) {
	
	fun validate(number: Int?) {
		
		fun throwError(message: String) {
			
			fun doSomething() {
			
			}
			
			throw NullPointerException(message)
		}
		
		if (number == null) {
			throwError("can not be null")
		}
	}
	
	validate(valueA)
	validate(valueB)
	validate(valueC)
	
	println(valueA!! + valueB!! + valueC!!)
}