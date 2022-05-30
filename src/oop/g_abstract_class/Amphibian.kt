package oop.g_abstract_class

class Amphibian: Animal() {
	
	fun lays() {
	
	}
	
	override val gender: Boolean
		get() = true
	
	override fun run() {
		println("Amfibi berlari")
	}
	
}