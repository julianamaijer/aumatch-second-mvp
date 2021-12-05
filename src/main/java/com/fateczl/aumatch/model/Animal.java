package com.fateczl.aumatch.model;


public class Animal {

    private String porte;
    private int idade;
    private String sexo;
    private long animalId;
    private String tipo;
    private String status;

    public Animal(String porte, int idade, String sexo, String tipo, String status) {
        this.porte = porte;
        this.idade = idade;
        this.sexo = sexo;
        this.tipo = tipo;
        this.status = status;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(long animalId) {
        this.animalId = animalId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
