package com.example.compito.controller;


import com.example.compito.entity.Articolo;
import com.example.compito.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/articolo")
public class ArticoloController {

    @Autowired
    ArticoloService articoloService;

    @GetMapping(value = "getAllArticoli")
    public List<Articolo> getAllArticoli(){

        return articoloService.getAllArticoli();
    }

    @PostMapping(value="addArticolo")
    public String addDocente(@RequestBody Articolo articolo){

        articoloService.save(articolo);
        return "Articolo salvato";
    }

}
