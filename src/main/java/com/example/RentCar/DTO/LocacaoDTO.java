package com.example.RentCar.DTO;

import com.example.RentCar.model.Carro;

import java.util.Date;

public class LocacaoDTO {

    private int id;

    private ClienteDTO id_client;


    private Carro id_carro;

    private Date data_locacao;

    public LocacaoDTO() {
    }

    public LocacaoDTO(int id, ClienteDTO id_client, Carro id_carro, Date data_locacao) {
        this.id = id;
        this.id_client = id_client;
        this.id_carro = id_carro;
        this.data_locacao = data_locacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteDTO getId_client() {
        return id_client;
    }

    public void setId_client(ClienteDTO id_client) {
        this.id_client = id_client;
    }

    public Carro getId_carro() {
        return id_carro;
    }

    public void setId_carro(Carro id_carro) {
        this.id_carro = id_carro;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }
}
