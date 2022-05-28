package oop.f_overloading

open class Animal(val name: String = "Roni", val age: Int = 1) {
	var weight: Int = 0
	var height: Int = 0

	fun run() {
	
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
	
	open fun sleep() {
		println("Hewan tidur")
	}
	
	fun breath() {
	
	}
	
	constructor(name: String, age: Int, weight: Int): this(name, age) {
		this.weight = weight
	}
	
}