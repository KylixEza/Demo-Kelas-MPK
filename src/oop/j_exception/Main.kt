package oop.j_exception

fun main() {
	
	//val causeMissType: String = "Hello"
	
	try {
		val causeArithmeticException = 1 / 0
		val nullable: String? = null
		val causeNullPointerException = nullable!!
		val causeNumberFormatException = "Hello World!".toInt()
	} catch (e: ArithmeticException) {
		println("Error disebabkan karena Arithmetic Exception oleh ${e.localizedMessage}")
	} catch (e: NullPointerException) {
		println("Error disebabkan karena NPE oleh ${e.localizedMessage}")
	} catch (e: NumberFormatException) {
		println("Error disebabkan karena Number Format Exception oleh ${e.localizedMessage}")
	} finally {
		println("Apapun yang terjadi, finally tetap berjalan")
	}
}