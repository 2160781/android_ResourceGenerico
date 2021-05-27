package com.example.android_resource;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DadosApp {

    private List<Receita> listaReceitas;
    private int posicao;


    // singleton
    public DadosApp(int tarefaPosicao, int MaxtarefaPosicao) {


        tarefaPosicao = 1;
        posicao = tarefaPosicao;



        listaReceitas = new ArrayList<>();
        listaReceitas.add(new Receita(tarefaPosicao, MaxtarefaPosicao));




    }


    public String getTextoPassoReceita() {

        return listaReceitas.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaReceitas.size())
            posicao++;

    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        listaReceitas.get(posicao - 1).marcarFeito();
    }


}
