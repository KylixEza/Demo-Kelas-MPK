package control_flow

fun main() {
	mathOperation2(MathCommand.ADD, 4, 3)
}

fun mathOperation2(command: MathCommand, valueA: Int, valueB: Int) {
	when(command) {
		MathCommand.ADD -> {
			println(valueA + valueB)
			println(valueA + valueB)
		}
		MathCommand.MINUS -> println(valueA - valueB)
		MathCommand.TIMES -> println(valueA * valueB)
		MathCommand.DIVIDE -> println(valueA / valueB)
	}
}