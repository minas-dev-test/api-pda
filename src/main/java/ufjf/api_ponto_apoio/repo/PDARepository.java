package ufjf.api_ponto_apoio.repo;



import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import ufjf.api_ponto_apoio.classes.PDA;

// Fornece algumas queries simples
@Repository
public interface PDARepository extends MongoRepository<PDA,String> {

    // (@campo cep) == (@param cep)
    public List<PDA> findByCEP(String cep);

    // equivalente a | select * from (@repo) where (@campo) like (@param)
    public List<PDA> findByNomeLike(String nome);
    public List<PDA> findByCidadeLike(String cidade);
    public List<PDA> findByBairroLike(String bairro);
    public List<PDA> findByEnderecoLike(String endereco);

}