package br.com.alura.bytebank.modelo


class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
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
