package com.geovanna.tarefas.adapters;

import com.geovanna.tarefas.core.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}
