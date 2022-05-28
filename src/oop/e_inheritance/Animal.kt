package oop.e_inheritance

open class Animal(val name: String = "Roni", val age: Int = 1) {
	var weight: Int = 0
	var height: Int = 0

	fun run() {
	
	}
	
	fun eat() {
	
	}
	
	open fun sleep() {
		println("Hewan tidur")
	}
	
	fun breath() {
	
	}
	
	constructor(name: String, age: Int, weight: Int): this(name, age) {
		this.weight = weight
	}
	
}