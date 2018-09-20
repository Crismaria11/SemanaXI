package figuras

import comportamientos.Dibujables
import java.util.*

open class Triangulo: Dibujables {
    var altura: Int

    constructor(_altura: Int){
        altura = _altura
    }

    override fun toString(): String {
        return """
            altura: ${altura}
        """.trimIndent()
    }

    override fun dibujar() {
        val alto = Scanner(System.`in`)
        print("De que longitud desea la altura?")

        var integer: Int = alto.nextInt()
        println("Deseas $integer de altura")

        for (i in alto){
            println(alto)
        }
    }
}