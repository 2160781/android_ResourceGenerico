package com.example.android_resource;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Plano {

    private List<Tarefas> listaPassos;
    private int posicao;
    private int total_passos;

    public Plano(int tarefaPosicao, int MaxtarefaPosicao){



        listaPassos = new ArrayList<>();
        listaPassos.add(new Tarefas("1. Passo --> Preparação de ingredientes"));
        listaPassos.add(new Tarefas("2. Passo --> Mistura de ingredientes"));
        listaPassos.add(new Tarefas("4. Passo --> Coloque o bolo no forno"));
        listaPassos.add(new Tarefas("5. Passo --> Finalizar o bolo"));

        posicao = 1;
        total_passos = listaPassos.size();

        tarefaPosicao = 1;

        for(int i = tarefaPosicao; i < total_passos; i++){
            Log.d("Tarefa", String.valueOf(listaPassos.get(i)));
        }


    }

    public String getTexto() {
        return listaPassos.get(posicao - 1).getTexto();
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {

        listaPassos.get(posicao - 1).setFeito(true);
    }


}
