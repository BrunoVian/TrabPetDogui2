package br.com.unipar.frameworks.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;
    
    @Column(length = 120)
    private String logradouro;
    @Column(length = 10)
    private String numero;
    @Column(length = 60)
    private String bairro;
    @Column(length = 9)
    private String cep;
   
    public Endereco(Cliente cliente, Cidade cidade, String logradouro, 
            String numero, String bairro, String cep) {
        this.cliente = cliente;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    public Endereco() { }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "idEndereco=" + idEndereco + 
                ", cliente=" + cliente + ", cidade=" + cidade.toString() + 
                ", logradouro=" + logradouro + ", numero=" + 
                numero + ", bairro=" + bairro + ", cep=" + cep + 
                '}';
    }
    
    
}
