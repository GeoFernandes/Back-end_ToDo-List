package com.geovanna.tarefas.core.UseCase.tarefa;

import com.geovanna.tarefas.core.entity.Tarefa;

public interface TarefaUseCase {

    public String criar(Tarefa tarefa);

    public Tarefa alterar(Tarefa tarefa);

    public void excluir(Long id);
}
