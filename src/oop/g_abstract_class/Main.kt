package oop.g_abstract_class

fun main() {
	
	val cat = Mammal()
	cat.run()
	
	val parrot = Bird()
	parrot.run()
	
	val frog = Amphibian()
	frog.run()
	
	val dog = object: Animal() {
		override val gender: Boolean
			get() = true
		
		override fun run() {
			println("Anjing berlari")
		}
	}
	
	dog.run()
}