package com.example.android_resource;

import java.util.ArrayList;
import java.util.List;

public class DadosApp {

    private List<Plano> listaPlanos;
    private int posicao;


    // singleton
    public DadosApp() {
/*

        tarefaPosicao = 1;
        posicao = tarefaPosicao;

*/

        listaPlanos = new ArrayList<>();
        listaPlanos.add(new Plano());
        posicao = 1;



    }


    public String getTextoPassoReceita() {

        return listaPlanos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPlanos.size())
            posicao++;

    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        listaPlanos.get(posicao - 1).marcarFeito();
    }


}
