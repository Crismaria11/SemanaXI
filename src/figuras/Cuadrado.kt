package figuras

import comportamientos.Dibujables
import java.util.*


open class Cuadrado:Dibujables {
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
        val lado = Scanner(System.`in`)
        print("De que longitud desea cada lado?")

        var integer: Int = lado.nextInt()
        println("Desea $integer de lado")

        for (i in lado){
            println(lado)
        }
    }



}

