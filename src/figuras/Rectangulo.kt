
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

    //funcion para dibujar
    override fun dibujar() {
        val longitudH = readLine()
        if (longitudH != null) {
            for (i in longitudH) {
                println(longitudH)
            }
        }

        val longitudV = readLine()
        if (longitudV != null) {
            for (i in longitudV) {
                println(longitudV)
            }
        }

    }

    //funcion para describir
    override fun describir() {
        //Use el scanner como un input
        val longitudH = readLine()
        println("la longitud horizontal que desea es: " +longitudH)

        val longitudV = readLine()
        println("la longitud vertical que desea es: " +longitudV)
    }


}