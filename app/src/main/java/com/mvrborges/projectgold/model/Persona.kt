package com.mvrborges.projectgold.model

class Persona {

    companion object Factory{
        fun create(): Persona = Persona()
    }

    var uid: String? = null
    var nome: String? = null
    var sobrenome: String? = null
    var email: String? = null

//    override fun toString(): String {
//        return nome.toString()
//    }
}
