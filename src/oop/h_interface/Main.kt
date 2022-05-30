package oop.h_interface

fun main() {
	
	val cat = Mammal()
	cat.eat()
	cat.eat("royal canin")
	cat.eat("royal canin", 1)
	
	val dog = Animal()
	dog.run()
	
	val rabbit = object: IAnimal {
		override val gender: Boolean
			get() = true
		
		override fun run() {
			println("Kelinci sedang berlari")
		}
		
		override fun sleep() {
			println("Kelinci sedang tidur")
		}
		
		override fun breath() {
			println("Kelinci sedang bernafas")
		}
	}
}