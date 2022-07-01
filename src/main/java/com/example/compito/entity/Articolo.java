package com.example.compito.entity;

import javax.persistence.*;



@Entity
//@Table (name="Recensioni")
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column
    private String nome;

    @Column
    private String prezzo;

    @Column
    private String recensioni;

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

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(String recensioni) {
        this.recensioni = recensioni;
    }
}