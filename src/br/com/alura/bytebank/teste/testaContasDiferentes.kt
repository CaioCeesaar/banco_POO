import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro",
                numero = 0,
                complemento = "",
                cep = "",
                cidade = "",
                estado = ""
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Joao",
            cpf = "",
            senha = 3
        ),
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)


    println("Saldo da conta corrente após deposito ${contaCorrente.saldo}")
    println("Saldo da conta poupança após deposito ${contaPoupanca.saldo}")
    println("Saldo da conta salário após deposito ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo da conta corrente após saque ${contaCorrente.saldo}")
    println("Saldo da conta poupança após saque ${contaPoupanca.saldo}")
    println("Saldo da conta salário após saque ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)
    contaPoupanca.transfere(100.0, contaSalario, 24234)

    println("saldo corrente após transferir para poupança ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência ${contaSalario.saldo}")

    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereco do titular ${contaCorrente.titular.endereco.logradouro}")
}