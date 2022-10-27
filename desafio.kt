// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

//enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val firstName: String, val lastName: String, val id: Int){
		fun usuario():String ="Nome completo: $nomeCompleto \nID: $id"
    	val nomeCompleto = firstName + " " + lastName
    //criar uma lista para armazenar os usuarios
}
//criar uma fun para realizar a matricula dos usuarios nos cursos
	
        

	
//fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
   // }


//data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

//data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

   // val inscritos = mutableListOf<Usuario>()
    

//}

fun main() {
    //testes
    val pessoa = Usuario("Luan","Moraes", 1)
    println(pessoa.usuario())
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
