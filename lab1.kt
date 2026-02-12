fun main() {

    val size = 5

    println("Triangle inversé")
    for (row in 0 until size) {
        repeat(row) { print(" ") }
        repeat(2 * (size - row) - 1) { print("*") }
        println()
    }

    println()

    println("Triangle droit")
    for (row in 1..size) {
        repeat(size - row) { print(" ") }
        repeat(row) { print("*") }
        println()
    }

    println()

    println("Losange")
    for (row in 1..size) {
        repeat(size - row) { print(" ") }
        repeat(2 * row - 1) { print("*") }
        println()
    }

    for (row in size - 1 downTo 1) {
        repeat(size - row) { print(" ") }
        repeat(2 * row - 1) { print("*") }
        println()
    }
}
