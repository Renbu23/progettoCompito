package com.example.compito.controller;


import com.example.compito.entity.Recensione;
import com.example.compito.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/recensione")
public class RecensioneController {

    @Autowired
    RecensioneService recensioneService;

    @GetMapping(value = "getAllRecensioni")
    public List<Recensione> getAllRecensioni(){

        return recensioneService.getAllRecensioni();
    }

    @PostMapping(value="addRecensione")
    public String addRecensione(@RequestBody Recensione recensione){

        recensioneService.save(recensione);
        return "Recensione salvata";
    }

}
