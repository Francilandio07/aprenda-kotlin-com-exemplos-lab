// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        for(individuo in usuario){
            inscritos.add(individuo)
        }
        
        println("Usuários Inscritos na formação $nome: ${inscritos}")
    }
}

fun main() {    
    //Criando conteúdo
    val conteudo1 = ConteudoEducacional("Matemática", 20)
    val conteudo2 = ConteudoEducacional("Gramática", 40)
    
    val listadeconteudos = listOf(conteudo1, conteudo2)
    
    //Criando Formação
    val formacao = Formacao("Conteudo geral", listadeconteudos, Nivel.INTERMEDIARIO)
    
    //Criando Usuário
    val usuario1 = Usuario("Francilandio", 22)
    val usuario2 = Usuario("Antonia", 19)
    
    //Matriculando o usuário
    formacao.matricular(usuario1, usuario2)
}
