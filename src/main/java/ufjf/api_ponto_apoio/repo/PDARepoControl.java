package ufjf.api_ponto_apoio.repo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import ufjf.api_ponto_apoio.classes.PDA;

// Encapsula o repositório em si e possibilita criação de queries mais elaboradas
public class PDARepoControl {

    @Autowired
    private PDARepository repository;

    public PDARepoControl(){

    }

    public List<PDA> getAll() {
        return repository.findAll();
    }

    public PDA findById(String id) {
        PDA get = repository.findById(id).get();
        return get;
    }

    public PDA insert(PDA p) {
        PDA novo = new PDA();
        BeanUtils.copyProperties(p, novo, "id");
        repository.save(novo);
        return novo;
    }

    public PDA update(PDA p) {
        PDA existente = null;
        try {
            existente = repository.findById(p.getId()).get();
        } catch(NoSuchElementException e) {
            return null;
        }
        BeanUtils.copyProperties(p, existente, "id");
        repository.save(existente);
        return existente;
    }

    public void delete(PDA p) {
        repository.delete(p);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}