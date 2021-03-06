package com.example.palindromo.domain

data class Palindromo(var _conteudo: String) {

    val conteudo: String = _conteudo
        get() {
            return field.toLowerCase()
        }

    fun ehPalindromo(): Boolean {
        return conteudo == conteudo.reversed()
    }

}