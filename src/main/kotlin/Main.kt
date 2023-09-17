fun main(args: Array<String>) {
    val listEmployee = mutableListOf<String>("Michail","Anna","Vitya")
    println(listEmployee.size)
    val foldedValue = listEmployee.fold("People:") { a, b -> "$a $b" }
    println(foldedValue)}