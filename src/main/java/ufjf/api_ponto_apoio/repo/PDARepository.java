package ufjf.api_ponto_apoio.repo;



import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import ufjf.api_ponto_apoio.classes.PDA;

// Fornece algumas queries simples
@Repository
public interface PDARepository extends MongoRepository<PDA,String> {

    public PDA findByNome(String nome);

}