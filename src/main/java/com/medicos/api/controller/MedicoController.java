package com.medicos.api.controller;

import com.medicos.api.model.Medico;
import org.springframework.web.bind.annotation.*;
import com.medicos.api.service.MedicoService;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService service;

    public MedicoController (MedicoService service){
        this.service = service;
    }

    @PostMapping
    public Medico cadastrar(@RequestBody Medico medico){
        return service.salvar(medico);
    }

    @GetMapping
    public List<Medico> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Medico buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico medico){
        return service.atualizar(id, medico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
