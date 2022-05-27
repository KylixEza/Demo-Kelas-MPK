package oop.c_constructor

fun main() {
	
	val dog = Animal("Udin", 2)
	dog.height = 35
	dog.weight = 4
	
	val cat = Animal("Gani", 5, 3)
	println(cat.weight)
}