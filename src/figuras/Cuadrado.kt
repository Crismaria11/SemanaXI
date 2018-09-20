
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

    //funcion para dibujar
    override fun dibujar() {
        val lado = readLine()
        if(lado != null) {
            for (i in lado){
                println(lado)
            }
        }

    }

    //funcion para describir
    override fun describir() {
        val lado = readLine()
        println("la altura que desea es: " +lado)
    }
}


