fun main() {
    /*
        * Crea una única función (importante que sólo sea una) que sea capaz
        * de calcular y retornar el área de un polígono.
        * - La función recibirá por parámetro sólo UN polígono a la vez.
        * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
        * - Imprime el cálculo del área de un polígono de cada tipo.
    */
    var base: Double
    var altura: Double

    do {
        print("Ingrese el valor de la base:")
        base = readln().toDouble()
    } while (base < 1)
    do {
        print("Ingrese el valor de la altura:")
        altura = readln().toDouble()
    } while (altura < 1 || base == altura)

    val areaTriangulo = base * altura / 2
    println("El area del triangulo es: $areaTriangulo")

    val areaCuadrado = base * base
    println("El area del cuadrado es: $areaCuadrado")

    val areaRectangulo = base * altura
    println("El area del rectangulo es: $areaRectangulo")
}