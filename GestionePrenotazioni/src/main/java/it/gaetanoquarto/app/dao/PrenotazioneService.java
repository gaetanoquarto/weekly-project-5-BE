package it.gaetanoquarto.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.gaetanoquarto.app.entity.Postazione;
import it.gaetanoquarto.app.entity.Prenotazione;

@Service
public class PrenotazioneService {
	
	@Autowired
    private PrenotazioneRepository prenotazioneRepo;

    public void insertPrenotazione(Prenotazione pre) {
        prenotazioneRepo.save(pre);
        System.out.println("Prenotazione inserita correttamente!");
    }

}
