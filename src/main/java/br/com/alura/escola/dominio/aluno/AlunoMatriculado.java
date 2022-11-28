package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    public final CPF cpfDoAluno;
    public final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return null;
    }
}
