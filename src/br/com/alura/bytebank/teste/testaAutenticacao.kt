import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        "José",
        "444.444.444-44",
        3000.0,
        1234
    )

    val diretor = Diretor(
        "Maria",
        "555.555.555-55",
        5000.0,
        1234,
        200.0
    )

    val cliente = Cliente(
        nome = "João",
        cpf = "666.666.666-66",
        senha = 123456
    )

    val sistemaInterno = SistemaInterno()

    try {
        sistemaInterno.entra(gerente, 124)
        sistemaInterno.entra(diretor, 134)
        sistemaInterno.entra(cliente, 23456)
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na autenticação")
        e.printStackTrace()
    }


}