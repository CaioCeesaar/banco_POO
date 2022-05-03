package br.com.alura.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : Admin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double
        get() {
            return salario * 0.15
        }


}