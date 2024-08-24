fun main() {
    /*
        * Crea un programa que invierta el orden de una cadena de texto
        * sin usar funciones propias del lenguaje que lo hagan de forma automática.
        * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
    */

    print("Ingrese la frase: ")
    var frase: String = readln()

    var fraseTemp: String = ""

    for (i in frase.length-1 downTo 0){
        fraseTemp = fraseTemp + frase[i]
    }

    println("La frase ${frase} dada vuelta queda ${fraseTemp}.")
}