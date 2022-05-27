package oop.d_visibility_modifier

fun main() {
	
	val dog = Animal("Udin", 2)
	dog.height = 35
	dog.weight = 4
	
	dog.run()
	dog.breath()
	
	val cat = Mammal()
	cat.sleep2()
}