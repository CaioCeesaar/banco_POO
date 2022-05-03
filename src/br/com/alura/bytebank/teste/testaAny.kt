package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "12345-678"
    )
    println(endereco.equals(endereco))
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}