package com.example.compito.service;

import com.example.compito.entity.Recensione;
import com.example.compito.repository.RecensioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecensioneServiceImpl implements RecensioneService {

    @Autowired
    RecensioneRepository recensioneRepository;

    @Override
    public List<Recensione> getAllRecensioni() {
        return recensioneRepository.findAll();
    }

    @Override
    public void save(Recensione recensione) {
       recensioneRepository.save(recensione);
        System.out.println("recensione salvata!");
    }

    @Override
    public void delete(int idArticolo) {

    }
}

