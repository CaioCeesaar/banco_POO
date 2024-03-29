package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : Admin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double
        get() {
            return salario * 0.20 + plr
        }

}