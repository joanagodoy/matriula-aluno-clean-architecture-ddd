package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.shared.evento.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicadorDeEventos;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicadorDeEventos) {
		this.repositorio = repositorio;
		this.publicadorDeEventos = publicadorDeEventos;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);

		AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
		publicadorDeEventos.publicar(evento);
	}

}
