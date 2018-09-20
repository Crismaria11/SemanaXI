import comportamientos.Dibujables
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo

fun main(args: Array<String>) {
    val prueba = Rectangulo(5, 2)

    print(prueba)
}
fun empezarDibujo(rectangulo: Dibujables, triangulo: Dibujables, cuadrado: Dibujables) {
    for (i in 0 until 10){
        rectangulo.dibujar()

    }

}