package com.example.compito.repository;

import com.example.compito.entity.Recensione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecensioneRepository  extends JpaRepository<Recensione,Long> {

}
