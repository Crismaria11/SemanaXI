
package figuras

import comportamientos.Describibles
import comportamientos.Dibujables
import java.util.*

open class Triangulo: Dibujables, Describibles {
    var altura: Int

    constructor(_altura: Int){
        altura = _altura
    }

    override fun toString(): String {
        return """
            altura: ${altura}
        """.trimIndent()
    }

    //funcion para dibujar
    override fun dibujar() {
        val altura = readLine()
        if(altura != null) {
            for (i in altura){
                println(altura)
            }
        }

    }

    //funcion para describir
    override fun describir() {
        val altura = readLine()
        println("la altura que desea es: " +altura)
        }
    }