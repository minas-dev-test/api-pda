package ufjf.api_ponto_apoio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ufjf.api_ponto_apoio.repo.PDARepoControl;
import ufjf.api_ponto_apoio.classes.PDA;


// Mapeia a API REST
@RestController
@RequestMapping("/pontos_de_apoio")
public class PDAController {

    @Autowired
    private PDARepoControl repoControl;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<PDA> getPDAs() {
        return repoControl.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PDA> getById(@PathVariable String id) {
        PDA p = repoControl.findById(id);
        if(p == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<PDA> addPDA(@Valid @RequestBody PDA pda) {
        PDA novo = repoControl.insert(pda);
        return ResponseEntity.ok(novo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PDA> updatePDA(@PathVariable String id, @Valid @RequestBody PDA pda) {
        PDA atualizado = repoControl.update(pda);
        if(atualizado == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(atualizado);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        repoControl.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}