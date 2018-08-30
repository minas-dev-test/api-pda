package ufjf.api_ponto_apoio.services;

import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufjf.api_ponto_apoio.classes.Key;
import ufjf.api_ponto_apoio.repo.KeyRepository;

@Service ("KeyService")
public class KeyServiceImplementation implements KeyService {

    @Autowired
    private KeyRepository repository;

	@Override
	public Key findKeyByNome(String nome) {
        Key k = null;
        k = repository.findById(nome).get();
        return k;
	}

	@Override
	public Key insert(Key key) {
        return repository.save(key);
	}

	@Override
	public Key update(Key key) {
        try {
            Key k = repository.findById(key.getNome()).get();
            BeanUtils.copyProperties(key, k);
            return repository.save(k);
        } catch(NoSuchElementException e) {
            return null;
        }
	}

	@Override
	public void delete(Key key) {
        repository.delete(key);
	}
}