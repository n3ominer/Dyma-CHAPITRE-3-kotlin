
enum class DayOfWeek {
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE
}

enum class Operation {
    ADD {
        override fun apply(a: Int, b: Int): Int {
            return a + b
        }
    },
    SUBSTRACT {
        override fun apply(a: Int, b: Int): Int {
            return a - b
        }
    },
    MULTIPLY {
        override fun apply(a: Int, b: Int): Int {
            return a * b
        }
    };

    abstract fun apply(a: Int, b: Int): Int
}

enum class Planet(val mass: Double, val radius: Double) {
    EARTH(5.97, 6371.0),
    MARS(0.642, 3389.0),
    JUPITER(1898.0, 69911.0);

    fun gravity(): Double {
        val G = 6.67430e-11
        return (G * mass) / (radius * radius)
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mainFunc()
    }

    private fun mainFunc() {
    	val earth = Planet.EARTH

        Log.d("Earth", "La masse de la plénète Terre est : ${earth.mass} * 10^24 kg ")
        Log.d("Earth", "La gravité de la plénète Terre est : ${earth.gravity()} m/s^2 ")

        val addition = Operation.ADD.apply(3, 5)
        Log.d("Operation", addition.toString())

        


        val dayOfWeek = DayOfWeek.entries[Random.nextInt(0..6)]

        when(dayOfWeek) {
            DayOfWeek.LUNDI -> Log.d("Day of week", DayOfWeek.LUNDI.name)
            DayOfWeek.MARDI -> Log.d("Day of week", DayOfWeek.MARDI.name)
            DayOfWeek.MERCREDI -> Log.d("Day of week", DayOfWeek.MERCREDI.name)
            DayOfWeek.JEUDI -> Log.d("Day of week", DayOfWeek.JEUDI.name)
            DayOfWeek.VENDREDI -> Log.d("Day of week", DayOfWeek.VENDREDI.name)
            DayOfWeek.SAMEDI -> Log.d("Day of week", DayOfWeek.SAMEDI.name)
            DayOfWeek.DIMANCHE -> Log.d("Day of week", DayOfWeek.DIMANCHE.name)
        }
    }
}