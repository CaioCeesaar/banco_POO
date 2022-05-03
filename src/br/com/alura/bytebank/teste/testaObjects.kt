package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "123.456.789-10"
        val senha: Int = 1234

        override fun autentica(senha: Int): Boolean {
            if (this.senha == senha) {
                return true
            }
            return false
        }
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1234)
    println("nome do cliente: ${fran.nome}")


    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaCorrente(titular = alex, numero = 1000)
    val contaCorrente = ContaPoupanca(titular = alex, numero = 1001)

    println("Total de contas criadas: ${Conta.total}")
}