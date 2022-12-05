package br.com.alura.gameficacao.dominio;

import br.com.alura.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDoAlunoPorCPF(CPF cpf);

}
