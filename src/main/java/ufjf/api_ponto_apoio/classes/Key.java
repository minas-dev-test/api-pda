package ufjf.api_ponto_apoio.classes;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="keys") // define a 'tabela' no BD

public class Key {

    @Id
    private String nome;

    private String api_key;

    /**
     * @return the api_key
     */
    public String getApi_key() {
        return api_key;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param api_key the api_key to set
     */
    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}