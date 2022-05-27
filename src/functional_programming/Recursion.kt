package functional_programming

fun main() {
	callMyName("Kylix")
}

private tailrec fun callMyName(myName: String, called: Int = 1) {
	println("$myName dipanggil sebanyak $called")
	callMyName(myName, called + 1)
}