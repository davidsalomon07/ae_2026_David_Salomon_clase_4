// ae_2026_David_Salomon_clase_4_main.kt
/// estructura del commit clase_4.5 {{valor incremental}}
data class Student(
	val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudents(): MutableList<Student>{
    val jorge = Student(
    	id = 1,
        email = "jorge@puce.com",	/// no importa el orden por que se especifica el tipo de dato
        grade = 9,
        isActive = true,
        name = "Jorge"
    ) 
    
    val diego = Student(
    	id = 2,
        email = "diego@puce.com",	
        grade = 8,
        isActive = true,
        name = "Diego"
    ) 
    
    val josue = Student(
    	id = 3,
        email = "josue@puce.com",	
        grade = 7,
        isActive = true,
        name = "Josue"
    )
    return mutableListOf (jorge, diego, josue)
}

fun getResult(grade: Int): String {  /// firma de la funcion
    return if(grade>7) "Aprobado" else "Reprobado"
}

fun main() {
    val estudiantesEstudiosos: MutableList<Student> = mutableListOf()
    for (student in getStudents()){
        if (student.grade>7){
            estudiantesEstudiosos.add(student)
        }
    }
    println(estudiantesEstudiosos)
    
    val estudiantesEstudiosos2: List<Student> = getStudents().filter { loQueSea -> 
        loQueSea.grade > 7 
    }
    
    println(estudiantesEstudiosos2)
    
}