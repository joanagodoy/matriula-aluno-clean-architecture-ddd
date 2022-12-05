package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.alura.shared.dominio.CPF;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void befofeEach(){
        this.aluno =  new Aluno(new CPF("123.456.789-00"),
                "Fulano",
                new Email("fulano@email.com"));
    }

    @Test
    void deveriaPermitirAdicionarUmTelefone(){
        aluno.adicionarTelefone("11", "32676595");
        Assertions.assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirAdicionarDoisTelefones(){
        aluno.adicionarTelefone("11", "32676595");
        aluno.adicionarTelefone("11", "32676595");
        Assertions.assertEquals(2, aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirAdicionarTresTelefones(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            aluno.adicionarTelefone("11", "32676595");
            aluno.adicionarTelefone("11", "32676595");
            aluno.adicionarTelefone("11", "32676595");
        });
    }

}
