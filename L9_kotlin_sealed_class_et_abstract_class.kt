 private fun mainFunc() {
        this.handleResult(Success("Success"))

        val cat = Cat("Minou")
        Log.d("Cat tag", cat.makeSound())
        cat.slepp()
    }


    fun handleResult(result: ResultSealedClass) {
        when(result) {
            is Success -> Log.d("Success tag", result.data)
            is Loading -> Log.d("Loading tag", "Loading...")
            is Failure -> Log.d("Failure tag", result.exception)
        }
    }


abstract class Animal(val name: String) {
    abstract fun makeSound(): String

    fun slepp() {
        Log.d("Animal tag", "$name est entraind e dormir")
    }
}

class Cat(name: String): Animal(name) {
    override fun makeSound(): String {
        return "Miaou"
    }
}


sealed class ResultSealedClass


// Sous-classes de la classe scellée
class Success(val data: String) : ResultSealedClass()
class Failure(val exception: String): ResultSealedClass()
data object Loading : ResultSealedClass()