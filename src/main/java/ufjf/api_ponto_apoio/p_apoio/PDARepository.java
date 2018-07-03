package ufjf.api_ponto_apoio.p_apoio;

import java.util.HashMap;

import org.springframework.beans.BeanUtils;

public class PDARepository {
    private HashMap<String,PDA> listaPDAs;

    public HashMap<String,PDA> getAllPDAs() {
        return this.listaPDAs;
    }

    public PDA findById(String id) {
        return listaPDAs.get(id);
    }

    public PDA insert(PDA p) {
        PDA novo = new PDA();
        BeanUtils.copyProperties(p, novo, "id");
        this.listaPDAs.put(novo.getId(), novo);
        return novo;
    }

    public PDA update(PDA source, PDA target) {
        BeanUtils.copyProperties(source, target, "id");
        this.listaPDAs.replace(source.getId(), target);
        return target;
    }

    public void delete(String id) {
        this.listaPDAs.remove(id);
    }
}