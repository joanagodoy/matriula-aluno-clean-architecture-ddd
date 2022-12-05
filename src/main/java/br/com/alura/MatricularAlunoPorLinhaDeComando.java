package br.com.alura;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.gameficacao.aplicacao.GeraSeloAlunoMatriculado;
import br.com.alura.gameficacao.infra.RepositorioDeSelosEmMemoria;
import br.com.alura.shared.evento.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.LogAlunoMatriculado;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogAlunoMatriculado());
		publicador.adicionar(new GeraSeloAlunoMatriculado(new RepositorioDeSelosEmMemoria()));

		MatricularAluno matricular = new MatricularAluno(
			new RepositorioDeAlunosEmMemoria(),
			publicador);

		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}
}
