package ufjf.api_ponto_apoio.services;

import java.util.List;

import ufjf.api_ponto_apoio.classes.PDA;


// Encapsula o repositório e possibilita criação de queries mais elaboradas

public interface PDAService {
    public List<PDA> getAll();
    public PDA findById(String id);
    public PDA insert(PDA p);
    public PDA update(String id, PDA p);
    public void delete(PDA p);
    public void deleteById(String id);
}
