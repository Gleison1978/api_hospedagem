package br.com.projetoapi.api.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospedagens")
public class Hospedagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private String cidade;
    private int quantQuartos;
    private int valor;


    public int getId() {
        return codigo;
    }

    public void setId(int id) {
        this.codigo = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public void setQuantQuartos(int quantQuartos) {
        this.quantQuartos = quantQuartos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
