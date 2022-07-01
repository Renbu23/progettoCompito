package com.example.compito.service;

import com.example.compito.entity.Articolo;

import java.util.List;

public interface ArticoloService  {

    List<Articolo> getAllArticoli();

    void save(Articolo articolo);

    void delete(int idArticolo);
}
