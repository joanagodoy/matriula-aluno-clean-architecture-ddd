package br.com.alura.shared.evento;

import br.com.alura.gameficacao.dominio.TipoEvento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();
    TipoEvento tipo();
    Map<String, Object> informacoes();

}
