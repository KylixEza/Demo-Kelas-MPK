package fundamental

fun main() {
	val nullableData: String? = null
	val length = nullableData?.length ?: 0
	println(length)
	
}