private fun mainFunc() {
    val dog = Dog()
    dog.makeSound()
    dog.eat()


    val dolphin = Dolphin()
    dolphin.eat()
    dolphin.makeSound()
    dolphin.swim()

    val vehicles: List<Movable> = listOf(Car(), Plane())

    for (vehicle in vehicles) {
        vehicle.move()
    }
}

interface Animal {

    fun makeSound(): String

    fun eat() {
        Log.d("Animal interface", "Eating")
    }

}


interface Named {
    val name: String
    val lastName: String
}

class Dog : Animal {
    override fun makeSound(): String {
        return "Waf-Waf"
    }

}


class Dolphin: Animal, Swimmer {
    override fun makeSound(): String {
        return "Clik-clik"
    }
}



interface Movable {

    fun move(): String
}

class Car: Movable {
    override fun move(): String {
        Log.d("Movable", "La voiture roule sur la route")
        return "LA voiture roule"
    }
}

class Plane: Movable {
    override fun move(): String {
        Log.d("Movable", "L'avion vole dans les airs")
        return "L'avion vole"
    }


}