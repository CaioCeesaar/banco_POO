package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "rua dos bobos", complemento = "casa")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int = endereco.complemento.length ?: throw IllegalStateException("Complemento não pode ser nulo")
        println(tamanhoComplemento)
    }
    teste("dfasd")
    teste(1)
}

fun teste (valor: Any) {
   val numero: Int? = valor as? Int
    println(numero)
}



















