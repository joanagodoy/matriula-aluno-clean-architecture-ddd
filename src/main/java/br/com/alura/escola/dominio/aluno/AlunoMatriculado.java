package br.com.alura.escola.dominio.aluno;

import br.com.alura.gameficacao.dominio.TipoEvento;
import br.com.alura.shared.evento.Evento;
import br.com.alura.shared.dominio.CPF;

import java.time.LocalDateTime;
import java.util.Map;

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

    @Override
    public TipoEvento tipo() {
        return TipoEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", cpfDoAluno);
    }
}
