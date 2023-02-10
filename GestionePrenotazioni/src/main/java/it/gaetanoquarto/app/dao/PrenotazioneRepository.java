package it.gaetanoquarto.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.gaetanoquarto.app.entity.Prenotazione;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer>{

}
