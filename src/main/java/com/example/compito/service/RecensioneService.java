package com.example.compito.service;



import com.example.compito.entity.Recensione;

import java.util.List;

public interface RecensioneService  {

    List<Recensione> getAllRecensioni();

    void save(Recensione recensione);

    void delete(int idRecensione);
}

