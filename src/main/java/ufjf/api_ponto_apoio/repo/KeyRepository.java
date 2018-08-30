package ufjf.api_ponto_apoio.repo;

import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ufjf.api_ponto_apoio.classes.Key;

@Repository
public interface KeyRepository extends MongoRepository<Key,String> {

        // Ja contem metodos CRUD basicos implementados
}