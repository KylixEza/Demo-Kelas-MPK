package fundamental

fun main() {
	val number = -1
	
	/*if(number > 0) {
		println("Bilangan tersebut merupakan bilangan positif")
	} else if (number < 0){
		println("Bilagan tersebut merupakan bilangan negatif")
	} else {
		println("Dia merupakan 0")
	}*/
	
	if (number % 2 == 1) {
		println("Dia merupakan bilangan ganjil")
	} else if (number % 2 == 0) {
		println("Dia merupaklan bilangan genap")
	} else {
		println("Dia merupakan 0")
	}
}