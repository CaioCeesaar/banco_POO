package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if(admin.autentica(senha)){
            println("Bem-vindo ao Bytebank!")
        } else {
            throw FalhaAutenticacaoException()
        }
    }
}