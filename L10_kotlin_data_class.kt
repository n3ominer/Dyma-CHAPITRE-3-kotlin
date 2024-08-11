fun main () {
	val person = Person("Alice", 30)
	println(person.toString()) 	

	// equals()
	val person1 = Person("Alice", 30)
	val person2 = Person("Alice", 30)
	println(person1 == person2) // Affiche "true"

	val person3 = person.copy(age = 31)
	println(person3) // Affiche "Person(name=Alice, age=31)"

}

// Déclaration d'une data class
data class Person(val name: String, val age: Int)
