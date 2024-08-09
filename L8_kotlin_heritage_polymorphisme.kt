open class Animal(val name: String) {
    open fun sound() {
        Log.d("Animal tag", "Generic sound")
    }

    open fun play() {
        Log.d("Animal tag", "I am playing")
    }
}

class Cat(name: String): Animal(name) {
    override fun sound() {
        Log.d("Cat tag", "Miaou")
    }

    fun doSomething(a: Int, b: Int) {

    }

    fun doSomething(a: Double, b: Double) {

    }

    fun doSomething() {

    }

    override fun play() {
        super.play()
        Log.d("Cat tag", "${this.name} is playing")
    }
}


class Dog(name: String): Animal(name) {
    override fun sound() {
        Log.d("Dog tag", "Waf waf")
    }
}


private fun mainFunc() {
    val cat = Cat("Minou")
    val dog = Dog("Milou")

    cat.doSomething()

    val animals: List<Animal> = listOf(cat, dog)

    animals.forEach {
        it.sound()
    }
}