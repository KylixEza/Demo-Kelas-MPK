package oop.i_import_and_package

import oop.e_inheritance.*
import kotlin.math.PI
import kotlin.random.Random

fun main() {
	
	val cat = Animal()
	val dog = Mammal()
	val parrot = Bird()
	
	println(Random(0).nextInt(1, 100))
	println(PI)
}