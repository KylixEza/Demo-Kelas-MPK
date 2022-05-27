package oop.b_properties

class Animal {
	var name: String = ""
	var age: Int = 0
	var weight: Int = 0
	var height: Int = 0
	
}

val Animal.getAnimalInfo
	get() = "I have a cat named ${this.name} and he was ${this.age} years old"

fun getAnimalInformation(animal: Animal, food: String) {
	println("""
			I have a cat named ${animal.name} and he was ${animal.age} years old. He likes to eating $food
		""".trimIndent())
}