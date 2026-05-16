// ae_2026_David_Salomon_clase_4_main.kt
// estructura del commit clase_4.2 {{valor incremental}}
fun main() {
    val grade: Int = 85
    
    if (grade > 70){
        println("Aprobado")
    } else {
        println ("Reprobado")
    }
    
    val result: String = if (grade > 70){
        "Aprobado"
    } else {
        "Reprobado"
    }
    
    println(result)
}