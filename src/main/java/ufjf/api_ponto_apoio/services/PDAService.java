package ufjf.api_ponto_apoio.services;

import java.util.List;

import ufjf.api_ponto_apoio.classes.PDA;


// Encapsula o repositório e permite tratar os dados

public interface PDAService {
    public List<PDA> getAll();
    public PDA findById(String id);
    public PDA insert(PDA p);
    public PDA update(String id, PDA p);
    public void delete(PDA p);
    public void deleteById(String id);
    public List<PDA> findByCEP(String cep);
    
    
    public List<PDA> findByNome(String nome);
    public List<PDA> findByCidade(String cidade);
    public List<PDA> findByEndereco(String endereco);
    
    
}
