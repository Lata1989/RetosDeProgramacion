fun main(){
    /*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
    var palabra1: String
    var palabra2: String

    print("Ingrese la primera palabra: ")
    palabra1 = readln()
    println("La primer palabra es: ${palabra1}")
    print("Ingrese la segunda palabra: ")
    palabra2 = readln()
    println("La primer palabra es: ${palabra2}")

    if (palabra1.lowercase() == palabra2.lowercase()) {
        println("Las palabras son iguales, no son un anagrama.")
    }

    palabra1=palabra1.lowercase()
    palabra1=ordenarPalabraAlfabeticamente(palabra1)
    println(palabra1)
    palabra2=palabra2.lowercase()
    palabra2=ordenarPalabraAlfabeticamente(palabra2)
    println(palabra2)

    if (palabra1.length == palabra2.length && palabra1 == palabra2) {
        println("Las palabras si forman un anagrama.")
    } else {
        println("Las palabras no forman un anagrama.")
    }
}

fun ordenarPalabraAlfabeticamente(palabra: String): String{
    return palabra.toCharArray().sorted().joinToString("")
}