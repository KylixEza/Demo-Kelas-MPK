package fundamental

fun main() {
	val string = "Hello World"
	/*string.forEachIndexed { index, char ->
		println("Character $char berada pada index $index")
	}
	println(string)*/
	
	//Hello "World"
	val escapedString = "Hello \"World\""
	//println(escapedString)
	
	val multipleLine = """
		Line1
		Line2
		Line3
	""".trimIndent()
	println(multipleLine)
}