package oop.c_constructor

class Animal(val name: String = "Roni", val age: Int = 1) {
	var weight: Int = 0
	var height: Int = 0
	
	init {
		println("Haloo object dibuat")
	}
	
	fun run() {
	
	}
	
	fun eat() {
	
	}
	
	fun sleep() {
	
	}
	
	fun breath() {
	
	}
	
	constructor(name: String, age: Int, weight: Int): this(name, age) {
		this.weight = weight
	}
	
}