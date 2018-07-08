package ufjf.api_ponto_apoio.classes;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class PDA {

    @Id
    private String id;

    private String nome;
    private String cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pnt_referencia;

    public PDA() {
        this.id = gerarUID();
    }

    // gera id com 32 caracteres
    public String gerarUID() {
        String id1 = UUID.randomUUID().toString().replace("-", "");
        return id1;
    }

    @Override
    public String toString() {
        return "PDA {" +
        "id: " + id + System.lineSeparator() +
        "nome: " + nome + System.lineSeparator() +
        "endereco: " + endereco + System.lineSeparator() +
        "numero: " + numero + System.lineSeparator() +
        "complemento: " + complemento + System.lineSeparator() +
        "bairro: " + bairro + System.lineSeparator() +
        "cidade: " + cidade + System.lineSeparator() +
        "estado: " + estado + System.lineSeparator() +
        "cep: " + cep + System.lineSeparator() +
        "pnt_referencia: " + pnt_referencia + System.lineSeparator() +
        "}";
    }
    
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }
    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }
    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * @return the pnt_referencia
     */
    public String getPnt_referencia() {
        return pnt_referencia;
    }
    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }/**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * @param pnt_referencia the pnt_referencia to set
     */
    public void setPnt_referencia(String pnt_referencia) {
        this.pnt_referencia = pnt_referencia;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}