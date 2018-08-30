package ufjf.api_ponto_apoio.services;


import ufjf.api_ponto_apoio.classes.Key;


// Encapsula o repositório e permite tratar os dados

public interface KeyService {
    public Key findKeyByNome(String nome);
    public Key insert(Key key);
    public Key update(Key key);
    public void delete(Key key);
}
