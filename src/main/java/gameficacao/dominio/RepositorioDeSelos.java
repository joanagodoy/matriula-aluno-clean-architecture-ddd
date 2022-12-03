package gameficacao.dominio;

import br.com.alura.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDoAlunoPorCPF(CPF cpf);

}
