package com.seberino.s2i;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicoTeste {
    

    public String comprimento(String nome)
    {
        String retorno =  "Bem vindo " + nome;
        return retorno;
    }

}
