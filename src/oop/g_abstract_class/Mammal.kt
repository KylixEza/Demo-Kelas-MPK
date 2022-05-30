package oop.g_abstract_class

class Mammal: Animal() {
	
	fun breastFeeding() {
	
	}
	
	override val gender: Boolean
		get() = true
	
	override fun run() {
		println("Mamalia berlari")
	}
	
	override fun sleep() {
		super.sleep()
		println( "Mamalia tidur dengan posisi 360 no scope")
	}
	
}