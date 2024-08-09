class FirstLevelClass {
    private val firstClassPropoerty: String = "FirstClass"

    class NestedClass {
        fun nestedClassFunc() {
            Log.d("Nested class tag", "Hello World!")
        }
    }

    inner class InnerClass {
        private val innerClassProperty: Int = 0
        fun innerFunc() {
            Log.d("Inner class prop", this.innerClassProperty.toString())
            Log.d("First level class prop", this@FirstLevelClass.firstClassPropoerty)
            Log.d("Inner class tag", "Hello World!")
        }
    }
}



class DataContainer {

    val data: List<String> = listOf("Un", "Deux", "Trois")

    class DataProcessor {
        fun processData(data: List<String>): List<String> {
            return data.map { it.uppercase() }
        }
    }
}



class Car(val model: String) {

    private val engine = Engine()

    inner class Engine {
        fun start() {
            Log.d("Engine tag", "Car ${this@Car.model} started")
        }
    }


    fun startEngine() {
        engine.start()
    }
}

 private fun mainFunc() {
    val nestedClass = FirstLevelClass.NestedClass()
    nestedClass.nestedClassFunc()

    val innerClass = FirstLevelClass().InnerClass()
    innerClass.innerFunc()


    val processor = DataContainer.DataProcessor()
    processor
        .processData(listOf("Hello", "World"))
        .forEach {
            Log.d("Processed data", it)
        }


    val car = Car("Audi")
    car.startEngine()


}