package org.generation.mentoritosdb.service;

import org.generation.mentoritosdb.model.Mentor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorService {
    private  final MentorRepository mentorRepository;

    @Autowired
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getMentores() {
        return mentorRepository.findAll(); // Hemos conectado la base de datos y traido todo de la table
    }

    public Mentor getMentor(Integer idMentor) {
        return mentorRepository.findById(idMentor).orElseThrow(() -> new IllegalMonitorStateException("EL Mentor con el id : " + idMentor + "no existe"));
    }
}
