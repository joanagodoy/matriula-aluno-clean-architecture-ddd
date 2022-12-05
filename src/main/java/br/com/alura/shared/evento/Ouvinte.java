package br.com.alura.shared.evento;

public abstract class Ouvinte {

    public void processa(Evento evento){
        if(this.devePrcessar(evento)){
            this.reageAo(evento);
        }
    }

    protected abstract void reageAo(Evento evento);

    protected abstract boolean devePrcessar(Evento evento);
}
