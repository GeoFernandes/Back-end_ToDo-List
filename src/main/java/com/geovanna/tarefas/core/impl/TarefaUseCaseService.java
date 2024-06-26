package com.geovanna.tarefas.core.impl;

import com.geovanna.tarefas.adapters.TarefaRepositoryService;
import com.geovanna.tarefas.core.UseCase.tarefa.TarefaUseCase;
import com.geovanna.tarefas.core.entity.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaUseCaseService implements TarefaUseCase {

   private final TarefaRepositoryService tarefaRepositoryService;

   @Autowired
    public TarefaUseCaseService(TarefaRepositoryService tarefaRepositoryService) {
        this.tarefaRepositoryService = tarefaRepositoryService;
    }

    public List<Tarefa> listarTarefa() {
        return tarefaRepositoryService.listarTarefa();
    }


    @Override
    public String criar(Tarefa tarefa) {
        tarefaRepositoryService.criarTarefa(tarefa);
        return "Tarefa criada com sucesso";
    }

    @Override
    public Tarefa alterar(Tarefa tarefa) {
        return tarefaRepositoryService.alterarTarefa(tarefa);
    }

    @Override
    public void excluir(Long id) {
        tarefaRepositoryService.excluirTarefa(id);
    }
}
