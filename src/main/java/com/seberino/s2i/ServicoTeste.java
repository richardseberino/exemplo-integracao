package com.seberino.s2i;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicoTeste {
    

    public String comprimento(Cliente cliente)
    {
        String retorno =  "Bem vindo " + cliente.getNome();
        return retorno;
    }

}
