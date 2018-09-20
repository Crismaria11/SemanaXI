package figuras

import comportamientos.Describibles
import comportamientos.Dibujables
import java.util.*


open class Cuadrado:Dibujables, Describibles {
    var longitud : Int


    constructor(_longitud: Int) {
        longitud = _longitud
    }

    override fun toString(): String {
        return """
            longitud: ${longitud}
        """.trimIndent()
    }

    override fun dibujar() {

    }

    override fun describir() {
        val lado = Scanner(System.`in`)
        print("De que longitud desea cada lado?")

        var integer: Int = lado.nextInt()
        println("Desea $integer de lado")

        for (i in lado) {
            println(lado)
        }
    }



}

