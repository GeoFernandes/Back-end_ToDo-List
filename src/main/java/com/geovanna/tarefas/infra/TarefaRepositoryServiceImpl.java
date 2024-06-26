package com.geovanna.tarefas.infra;

import com.geovanna.tarefas.adapters.TarefaRepository;
import com.geovanna.tarefas.adapters.TarefaRepositoryService;
import com.geovanna.tarefas.core.entity.Tarefa;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TarefaRepositoryServiceImpl implements TarefaRepositoryService {

    private final TarefaRepository tarefaRepository;

    @Override
    public List<Tarefa> listarTarefa() {
        return tarefaRepository.findAll() ;
    }

    @Override
    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public Tarefa alterarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void excluirTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}
