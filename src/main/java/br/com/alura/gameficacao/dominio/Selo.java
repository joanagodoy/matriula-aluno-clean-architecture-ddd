package br.com.alura.gameficacao.dominio;

import br.com.alura.shared.dominio.CPF;

public class Selo {

    private CPF cfpDoAluno;
    private String nome;

    public Selo(CPF cfpDoAluno, String nome) {
        this.cfpDoAluno = cfpDoAluno;
        this.nome = nome;
    }

    public CPF getCfpDoAluno() {
        return cfpDoAluno;
    }

    public String getNome() {
        return nome;
    }
}
