package fail.sazz.learningkotlin

fun fancyPrint(message: String) {
    println(message)
}

fun fancyPrintWithPrefix(message: String, prefix: String = "[INFO]") {
    println("$prefix $message")
}

fun somar(valor1: Int, valor2: Int): Int {
    return valor1 + valor2
}

fun multiplicar(valor1: Int, valor2: Int): Int {
    return valor1 * valor2
}

fun main() {
    fancyPrint("owo!")
    fancyPrintWithPrefix("Olá Mundo!")
    println(somar(1, 2))
    println(multiplicar(10, 5))
}