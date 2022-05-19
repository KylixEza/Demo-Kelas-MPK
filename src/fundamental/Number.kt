package fundamental

fun main() {
	val integer = 1
	val decimal = 1.0
	val byte: Byte = 127
	
	val valueA = 100.0
	val valueB = 300
	
	println(valueA + valueB)
	println(valueA - valueB)
	println(valueA * valueB)
	println((valueA / valueB))
	println(valueA % valueB)
	
	val readableNumber = 1_000_000_000
	println(readableNumber)
	
	val string = "20"
	println(string.toInt())
}