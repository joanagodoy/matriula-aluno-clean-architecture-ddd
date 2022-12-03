package gameficacao.dominio;

import br.com.alura.escola.dominio.aluno.CPF;

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
