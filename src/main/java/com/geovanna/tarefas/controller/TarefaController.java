package com.geovanna.tarefas.controller;

import com.geovanna.tarefas.core.impl.TarefaUseCaseService;
import com.geovanna.tarefas.core.entity.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefa")
public class TarefaController {

    private final TarefaUseCaseService tarefaUseCaseService;

    @Autowired
    public TarefaController(TarefaUseCaseService tarefaUseCaseService) {
        this.tarefaUseCaseService = tarefaUseCaseService;
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> ListarTarefa() {
        return ResponseEntity.ok(tarefaUseCaseService.listarTarefa());
    }

    @PostMapping
    public ResponseEntity<String> criarTarefa(@RequestBody Tarefa tarefa) {
        tarefaUseCaseService.criar(tarefa);
        return ResponseEntity.ok("Tarefa criada com sucesso");
    }

    @PutMapping
    public ResponseEntity<Tarefa> alterarTarefa(@RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(tarefaUseCaseService.alterar(tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirTarefa(@PathVariable Long id) {
        tarefaUseCaseService.excluir(id);
        return  ResponseEntity.ok("Tarefa removida com sucesso");
    }
}
