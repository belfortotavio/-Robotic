package com.example.robotic;


public class Placas {
    private String nome;
    private String mac; // vai armazenar o identificador do recurso
    private String status;

    public Placas(String nome, String endereco, String status) {
        this.nome = nome;
        this.mac = endereco;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // métodos getters e setters

}
