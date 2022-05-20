package functional_programming

fun main() {
	"Kylix".callMyName()
	functionWithLambdaArgument("Kylix")
}

private fun functionsWithLambdaReceiver() {
	
	val myName = "My name is Kylix Eza"
	
	//Mengambalikan nilai di akhir lambda
	myName.run {
		return@run false
	}
	
	//Fungsinya sama seperti run, tapi hanya beda model penulisan saja
	with(myName) {
		return@with true
	}
	
	//Tidak mengembalikan nilai di akhir lambda
	myName.apply {
		return@apply
	}
}

private fun String.callMyName() {
	println(this)
}

private fun functionWithLambdaArgument(message: String?) {
	
	//Handling null
	message?.let {
		println(it)
	} ?: run {
		println("value is null")
	}
	
	val myName = "My name is Kylix Eza"
	
	//Sama seperti apply
	myName.also {
	
	}
}