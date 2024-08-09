fun main() {
	val person = Person()
    
    val person1 = Person("+33 1 11 11 11 11", false)
    
    person.name = "Ramzy"
    person.age = 26
    
    person.displayInfos()
    person.displayLoveSituation()
    println("Le salaire de ${person.name} est de ${person.getSalary()}€")
    
    person1.displayInfos()
    person1.displayLoveSituation()
    person1.updateSalary(3000)
    println("Le salaire de ${person1.name} est de ${person1.getSalary()}€")
    
    println("La voiture de ${person1.name} est : ${person1.carName}")
    
}

class Person() {
    var name: String = ""
    var age: Int = 0
    
	lateinit var someVariabel: String
    
    val carName by lazy {
        loadPersonCaraFromServer()
    }
    
    private var phoneNumber: String = "/"
    private var isSingle: Boolean = true
    
	private var salary: Int
    
    constructor(phone: String, single: Boolean): this() {
        this.phoneNumber = phone
        this.isSingle = single
    }
    
    init {
        salary = 0
    }
    
    private fun loadPersonCaraFromServer(): String {
        return "Audi"
    }
    
    
    fun displayInfos() {
        println("Bonjour, je m'appelle ${this.name} et j'ai ${this.age} ans et mon numéro de téléphone est le ${this.phoneNumber}")
    }
    
    fun displayLoveSituation() {
        if (this.isSingle) {
            println("Je suis célibataire")
        } else {
            println("Je suis en couple")
        }
    }
    
    fun updateSalary(newSalary: Int) {
        this.salary = newSalary
    }
    
    fun getSalary(): Int {
        return this.salary
    }
}
