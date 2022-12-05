package br.com.alura.shared.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte){
        ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento){
        this.ouvintes.forEach(o -> {
            o.processa(evento);
        });
    }
}
