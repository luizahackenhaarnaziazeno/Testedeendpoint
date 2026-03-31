package br.testedeendpoint.testedeendpoint.persistencia;

import java.util.List;

public interface IEventoRepository {
    List<Evento> getEventos();
    Evento getCodigo(long codigo);


}

