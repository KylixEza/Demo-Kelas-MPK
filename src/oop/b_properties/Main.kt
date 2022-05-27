package oop.b_properties

fun main() {
	val cat = Animal()
	cat.name = "Abdul"
	cat.age = 2
	cat.height = 40
	cat.weight = 6
	
	cat.name = "Nopal"
	
	getAnimalInformation(cat, "royal canin")
	val animalInfo = cat.getAnimalInfo
	println(animalInfo)
}