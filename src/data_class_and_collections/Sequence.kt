package data_class_and_collections

fun main() {
	val list = (1..1000000).toList()
	list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}