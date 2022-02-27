package org.generation.mentoritosdb.controller;

import org.generation.mentoritosdb.model.Mentor;
import org.generation.mentoritosdb.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/getMentores/")
public class MentorController {
    private final MentorService mentorService;

    @Autowired
    public MentorController(MentorService mentorService){
        this.mentorService = mentorService;
    }

    @GetMapping
    public List<Mentor> getMentores(){
        return mentorService.getMentores();
    }

    @GetMapping(path = "{id_mentor}") // adiciona un parametro al path para que que pueda ser leido
    public Mentor getMentor(@PathVariable("id_mentor") Integer id_mentor){ // Se especifica cual va a a ser el parametro que se esta leyendo y de que tipo
        return mentorService.getMentor(id_mentor);
    }
}

