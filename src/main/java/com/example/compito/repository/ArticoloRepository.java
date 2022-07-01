package com.example.compito.repository;


import com.example.compito.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticoloRepository extends JpaRepository<Articolo,Long> {

}
