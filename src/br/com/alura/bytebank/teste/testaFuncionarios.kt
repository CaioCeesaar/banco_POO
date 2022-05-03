import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {
    val jonas: Funcionario = Analista(
        nome = "Jonas",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("nome: ${jonas.nome}")
    println("cpf: ${jonas.cpf}")
    println("salário: ${jonas.salario}")
    println("bonificação: ${jonas.bonificacao}")

    val caio: Gerente = Gerente(
        nome = "Caio",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${caio.nome}")
    println("cpf: ${caio.cpf}")
    println("salário: ${caio.salario}")
    println("bonificação: ${caio.bonificacao}")

    if (caio.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val van = Auxiliar(
        nome = "Vanessa",
        cpf = "333.333.333-33",
        salario = 1500.0
    )

    val bruno: Diretor = Diretor(
        nome = "Bruno",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4321,
        plr = 200.0
    )

    println("nome: ${bruno.nome}")
    println("cpf: ${bruno.cpf}")
    println("salário: ${bruno.salario}")
    println("bonificação: ${bruno.bonificacao}")
    println("plr: ${bruno.plr}")

    if (bruno.autentica(4321)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val maria: Analista = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(jonas)
    calculadora.registra(caio)
    calculadora.registra(bruno)
    calculadora.registra(maria)
    calculadora.registra(van)

    println("Total de bonificações: ${calculadora.total}")
}