package com.trabalho.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "imoveis")
public class Imovel {

    @Id
    private String id;
    private String endereco;
    private String tipoImovel;
    private double area;
    private double preco;

    // Getters and Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTipoImovel() {
        return tipoImovel;
    }
    
    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}