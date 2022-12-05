package br.com.alura.gameficacao.aplicacao;

import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.gameficacao.dominio.RepositorioDeSelos;
import br.com.alura.gameficacao.dominio.Selo;
import br.com.alura.gameficacao.dominio.TipoEvento;
import br.com.alura.shared.dominio.CPF;
import br.com.alura.shared.evento.Evento;
import br.com.alura.shared.evento.Ouvinte;

public class GeraSeloAlunoMatriculado extends Ouvinte {

    final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoMatriculado(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo selo = new Selo(cpfDoAluno, "Novato");

        repositorioDeSelos.adicionar(selo);
        System.out.printf("Selo %s gerado para CPF %s",
                selo.getNome(),
                selo.getCfpDoAluno());
    }

    @Override
    protected boolean devePrcessar(Evento evento) {
        return evento.tipo().equals(TipoEvento.ALUNO_MATRICULADO);
    }
}
