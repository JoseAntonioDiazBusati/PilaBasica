//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pila = Pila<Int?>("Numeros enteros", 1, 5, 77, 89)
    val pila2 = Pila<Any>("Cajon desastre", listOf("123", null, "holi", 10.0, 'c',44), patron = "^[a-z]+$")

    for (elemento in 1..pila.size()) {
        println(pila.pop())
    }
    println(pila)
    println(pila2)
}