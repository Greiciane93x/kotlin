package br.com.alura.bytebank.exception

import java.lang.Exception

class SaldoInsuficienteException
    (mensagem: String) :
    Exception(mensagem)
