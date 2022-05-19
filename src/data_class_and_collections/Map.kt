package data_class_and_collections

fun main() {
	val map1 = mapOf(
		Matkul.MATKUL1 to "Pemrograman Dasar",
		Matkul.MATKUL2 to "Pemrograman OOP",
		Matkul.MATKUL3 to "Basis Data",
	)
	
	val map2 = map1.toMutableMap()
	
	map2.put(Matkul.MATKUL4, "Sistem Operasi")
	
	println(map2.get(Matkul.MATKUL4))
}

enum class Matkul {
	MATKUL1, MATKUL2, MATKUL3, MATKUL4
}