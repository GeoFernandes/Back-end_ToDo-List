package com.geovanna.tarefas.adapters;

import com.geovanna.tarefas.core.entity.Tarefa;

import java.util.List;

public interface TarefaRepositoryService {

    public List<Tarefa> listarTarefa();

    public Tarefa criarTarefa(Tarefa tarefa);

    public Tarefa alterarTarefa(Tarefa tarefa);

    public void excluirTarefa(Long id);
}
