package control_flow

fun main() {
	//mathOperation("minus", 1, 2)
	//mathOperation("tambah", 1, 2)
	mathOperation(MathCommand.ADD, 1, 2)
	mathOperation(MathCommand.TIMES, 4, 3)
}

fun mathOperation(command: MathCommand, valueA: Int, valueB: Int) {
	if (command == MathCommand.ADD) {
		println(valueA + valueB)
	} else if (command == MathCommand.MINUS) {
		println(valueA - valueB)
	} else if (command == MathCommand.TIMES) {
		println(valueA * valueB)
	} else if (command == MathCommand.DIVIDE) {
		println(valueA / valueB)
	} else {
		println("Command not found")
	}
}

enum class MathCommand(val indonesian: String) {
	ADD("tambah"),
	MINUS("kurang"),
	TIMES("kali"),
	DIVIDE("bagi")
}