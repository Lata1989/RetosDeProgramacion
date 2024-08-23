fun main() {
    /*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

    println("El numero 2 es primo.")
    for (i in 3..100) {
        var esPrimo = true
        for (j in 2..i - 1) {
            if (i % j == 0) {
                esPrimo = false
                break
            }
        }
        if (esPrimo){
            println("El numero ${i} es primo.")
        }
    }
}