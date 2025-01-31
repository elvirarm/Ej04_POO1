//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
      

    fun main() {
        // Coche correcto
        val coche1 = Coche("Blanco", "Nissan", "Juke", 300, 4, "3178JRY" )
        println(coche1)

        // Coche con la marca y la matrícula vacía, casca
        val coche2 = Coche("Blanco", "", "", 300, 4, "3178JRY" )
        println(coche2)

        val coche3 = Coche("Blanco", "Nissan", "Juke", 900, 4, "3178JRY" )
        println(coche3)

        val coche4 = Coche("Blanco", "Nissan", "Juke", 400, 10, "3178JRY" )
        println(coche4)

        val coche5 = Coche("Blanco", "Nissan", "Juke", 300, 4, "31783178JRY" )
        println(coche5)

        val coche6 = Coche("", "", "", 0, 0, "" )
        println(coche6)

    }
}