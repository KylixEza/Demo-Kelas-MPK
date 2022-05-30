package oop.g_abstract_class

class Bird: Animal() {
	
	fun fly() {
	
	}
	
	override val gender: Boolean
		get() = true
	
	override fun run() {
		println("Burung berlari")
	}
	
}