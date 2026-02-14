package com.medicos.api.service;

import com.medicos.api.model.Medico;
import org.springframework.stereotype.Service;
import com.medicos.api.repository.MedicoRepository;

import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository repository;

    public MedicoService(MedicoRepository repository){
        this.repository = repository;
    }

    public Medico salvar(Medico medico) {
        return repository.save(medico);
    }

    public List<Medico> listarTodos(){
        return repository.findAll();
    }

    public Medico buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));
    }

    public Medico atualizar(Long id, Medico medico){
        Medico medicoExistente = buscarPorId(id);

        medicoExistente.setNome(medico.getNome());
        medicoExistente.setEspecialidade(medico.getEspecialidade());
        medicoExistente.setCrm(medico.getCrm());

        return repository.save(medicoExistente);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
