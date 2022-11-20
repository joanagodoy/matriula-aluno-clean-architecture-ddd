package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    public void deveriaDarExcecaoQuandoAdicionarTresTelefoes(){
        Aluno aluno = new Aluno(new CPF("123.456.789-00"),
                "Fulano",
                new Email("fulano@email.com"));

        aluno.adicionarTelefone("11", "32676595");
        aluno.adicionarTelefone("11", "32676595");
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> aluno.adicionarTelefone("11", "32676595"));
    }

}
