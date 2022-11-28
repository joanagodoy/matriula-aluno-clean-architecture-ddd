package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {

    @Override
    protected void reageAo(Evento evento) {
        String momentoFormatado = ((AlunoMatriculado) evento)
                .momento
                .format(DateTimeFormatter
                        .ofPattern("dd/MM/yyyy HH:mm"));
        System.out.printf("Aluno com CPF %s matriculado em %s",
                ((AlunoMatriculado) evento).cpfDoAluno,
                momentoFormatado);
    }

    @Override
    protected boolean devePrcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
