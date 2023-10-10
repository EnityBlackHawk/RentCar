package com.example.RentCar.DTO;

public class ClienteDTO {

    private int id;
    private String nome;
    private String cpf;
    private String cnh;

    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(int id, String nome, String cpf, String cnh, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
