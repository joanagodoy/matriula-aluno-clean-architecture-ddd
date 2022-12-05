package br.com.alura.gameficacao.infra;

import br.com.alura.shared.dominio.CPF;
import br.com.alura.gameficacao.dominio.RepositorioDeSelos;
import br.com.alura.gameficacao.dominio.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);

    }

    @Override
    public List<Selo> selosDoAlunoPorCPF(CPF cpf) {
        return selos
                .stream()
                .filter(selo -> selo.getCfpDoAluno().equals(cpf))
                .collect(Collectors.toList());
    }
}
