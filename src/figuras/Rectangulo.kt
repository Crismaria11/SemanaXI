package figuras

import comportamientos.Describibles
import comportamientos.Dibujables
import java.util.*

open class Rectangulo:Dibujables, Describibles {
    var longitudH : Int
    var longitudV: Int

    constructor(_longitudH: Int, _longitudV: Int) {
        longitudH = _longitudH
        longitudV = _longitudV
    }

    override fun toString(): String {
        return """
            longitudH: ${longitudH}
            longituV: ${longitudV}
        """.trimIndent()
    }

    override fun dibujar() {

    }

    override fun describir() {
        val horizontal = Scanner(System.`in`)
        print("De que longitud desea los lados horizontales?")

        var intege: Int = horizontal.nextInt()
        println("Deseas: $intege de longitud horizontal")

        val vertical = Scanner(System.`in`)
        print("Que longitud desea para los lados verticales")

        var integer: Int = vertical.nextInt()
        println("Deseas: $integer de longitud vertical")

        for (i in horizontal) {
            println(horizontal)
        }
        for (i in vertical)
            println(vertical)

    }


}