package com.example.RentCar.repository;

import com.example.RentCar.model.Cliente;
import com.example.RentCar.model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {
    List<Locacao> findByCliente(Cliente cliente);
}
