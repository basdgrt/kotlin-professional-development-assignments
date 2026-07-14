package nl.basdgrt

/**
 * Refactor [isPrime] to an extension function.
 */
fun Int.isPrime() = (2 until this).none {this % it == 0}