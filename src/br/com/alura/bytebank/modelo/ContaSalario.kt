package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.10
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}
