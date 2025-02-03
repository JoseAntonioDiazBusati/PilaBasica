class Pila<T>(val desc: String, private val patron: String = "") {

    private val elementos = mutableListOf<T>()

    constructor(desc: String, vararg elementos: T, patron: String = ""): this(desc, patron){
        addElements(elementos.toList())
    }

    constructor(desc: String, elementos: List<T>, patron: String = ""): this(desc, patron){
        addElements(elementos)
    }


    fun size() = elementos.size

    private fun isEmpty() = size() == 0

    private fun addElements(elementos: List<T>){
        for (elemento in elementos){
            push(elemento)
        }
    }

    fun pop(): T?{
        if (!isEmpty()) {
            val ultimoElemento = elementos[size() - 1]
            elementos.removeAt(size() - 1)
            return ultimoElemento
        }
        return null
    }


    fun checkElement(elemento: T?): Boolean{
        if (elemento == null) return false
        if ((elemento !is String) || (Regex(patron).matches(elemento))) return true
        return false
    }


    fun push(elemento: T): Boolean{
        if (checkElement(elemento)){
            elementos.add(elemento)
            return true
        }
        return false
    }

    override fun toString(): String {
        return if (!isEmpty()){
            "Pila(\"$desc\", elementos = ${elementos.reversed().joinToString(" - ")})"
        }else{
            "Pila(\"$desc\", **Vacía**)"
        }
    }
}