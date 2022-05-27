package oop.d_visibility_modifier

open class Animal(val name: String = "Roni", val age: Int = 1) {
	var weight: Int = 0
	var height: Int = 0

	fun run() {
	
	}
	
	private fun eat() {
	
	}
	
	protected fun sleep() {
	
	}
	
	internal fun breath() {
	
	}
	
	constructor(name: String, age: Int, weight: Int): this(name, age) {
		this.weight = weight
	}
	
}