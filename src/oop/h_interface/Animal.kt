package oop.h_interface

open class Animal(val name: String = "Roni", val age: Int = 1): IAnimal {
	var weight: Int = 0
	var height: Int = 0
	
	override val gender: Boolean
		get() = true
	
	override fun run() {
		println("Hewan sedang tidur")
	}
	
	fun eat() {
		println("Hewan $name makan")
	}
	
	fun eat(food: String) {
		println("Hewan $name makan dengan lauk $food")
	}
	
	fun eat(food: String, foodWeight: Int) {
		println("Hewan $name makan dengan lauk $food sehingga berat badannya naik menjadi ${weight + foodWeight}")
	}
	
	override fun sleep() {
		println("Hewan tidur")
	}
	
	override fun breath() {
		println("Hewan sedang bernafas")
	}
	
	constructor(name: String, age: Int, weight: Int): this(name, age) {
		this.weight = weight
	}
	
}