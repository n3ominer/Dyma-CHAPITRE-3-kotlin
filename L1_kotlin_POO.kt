fun main() {

    val person1 = Person("Ramzy", 26)
    println(person1)
    person1.displayInfos()
    
    val circle = Circle()
    val rectangle = Rectangle()
    val anyShape = Shape()
    
    circle.draw()
    rectangle.draw()
    anyShape.draw()
    
}

class Person(val name: String, val age: Int) {
    val phoneNumber: String = "+33 6 82 93 02 73"
    
    
    fun displayInfos() {
        println("Bonjour, je m'appelle ${this.name} et j'ai ${this.age} ans")
    }
}


open class Shape{
    open fun draw() {
        print("Any shape")
    }
}


class Circle(): Shape(){
    override fun draw() {
        println("Circle")
    }
}

class Rectangle(): Shape(){
    override fun draw() {
        println("Rectangle")
    }
}