package ufjf.api_ponto_apoio.p_apoio;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pda")
public class PDAController {

    @Autowired
    private PDARepository repositorio;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HashMap<String, PDA> getPDAs() {
        return repositorio.getAllPDAs();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PDA> getById(@PathVariable String id) {
        PDA p = repositorio.findById(id);
        if(p == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<PDA> addPDA(@Valid @RequestBody PDA pda) {
        PDA novo = repositorio.insert(pda);
        return ResponseEntity.ok(novo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PDA> updatePDA(@PathVariable String id, @Valid @RequestBody PDA pda) {
        PDA atual = repositorio.findById(id);
        if(atual == null) {
            return ResponseEntity.notFound().build();
        }
        atual = repositorio.update(pda, atual);
        return ResponseEntity.ok(atual);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        PDA p = repositorio.findById(id);
        if(p == null) {
            return ResponseEntity.notFound().build();
        }
        repositorio.delete(id);
        return ResponseEntity.noContent().build();
    }

}