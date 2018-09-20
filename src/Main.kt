/*
 Cristina Bautista
 Carne: 161260
 Fecha: 20-09-2018*/
import comportamientos.Describibles
import comportamientos.Dibujables
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo

fun main(args: Array<String>) {
    empezarDibujo(5, 3, 4)
    empezarDescripcion(5, 3, 4)
}

fun empezarDescripcion(rectangulo: Describibles, triangulo: Describibles, cuadrado: Describibles) {
    for(i in "") {
        rectangulo.describir()
        triangulo.describir()
        cuadrado.describir()
    }
}

fun empezarDibujo(rectangulo: Dibujables, triangulo: Dibujables, cuadrado: Dibujables) {
    for (i in 0 until 10){
        rectangulo.dibujar()
        triangulo.dibujar()
        cuadrado.dibujar()

    }

}