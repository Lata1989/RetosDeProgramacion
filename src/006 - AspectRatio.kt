import java.net.URL
import javax.imageio.ImageIO

fun main() {/*
        * Crea un programa que se encargue de calcular el aspect ratio de una
        * imagen a partir de una url.
        * - Url de ejemplo:
        *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
        * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
        *   imagen de 1920*1080px.
     */

    val url = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png"
    calculateAspectRatio(url)

}

fun calculateAspectRatio(url: String) {
    try {
        // Cargar la imagen desde la URL
        val imageUrl = URL(url)
        val image = ImageIO.read(imageUrl)

        // Obtener las dimensiones de la imagen
        val width : Int = image.width
        val heigth : Int = image.height

        println("El ancho de la imagen es: ${width}.")
        println("El alto de la imagen es: ${heigth}.")


        // Calculo el maximo comun divisor
        val mcd: Int = mcd(width, heigth)

        // Calculo los aspect ratio de cada uno de los lados
        val aspectRatioAncho : Int = width / mcd
        val aspectRatioAlto: Int = heigth / mcd

        println("El aspect ratio de la imagen es: ${aspectRatioAncho}:${aspectRatioAlto}.")
    } catch (e: Exception) {
        println("No se pudo calcular el aspect ratio de la imagen ${e.message}.")
    }

}

fun mcd(ancho: Int, alto: Int): Int {
    var num1: Int = ancho
    var num2: Int = alto

    while (num2 != 0){
        val temporal = num2
        num2 = num1 % num2
        num1 = temporal
    }

    return num1
}