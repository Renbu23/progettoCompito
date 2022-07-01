package com.example.compito.service;

import com.example.compito.entity.Articolo;
import com.example.compito.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticoloServiceImpl implements ArticoloService {

    @Autowired
    ArticoloRepository articoloRepository;

    @Override
    public List<Articolo> getAllArticoli() {

        return articoloRepository.findAll();
    }

    @Override
    public void save(Articolo articolo) {
        articoloRepository.save(articolo);
        System.out.println("Articolo salvato!");
    }

    @Override
    public void delete(int idArticolo) {

    }
}
