package org.generation.mentoritosdb.model;

import javax.persistence.*;

@Entity
public class Mentor extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMentor", unique = true, nullable = false)
    private Integer idMentor;
    private Integer idSubject;
    private String modality;
    private String video;

    public Mentor(String nombre, String lastname, String about, String education, String location, String imageProfile, String phone, String birthDate, String registerDate, String uId, Integer idMentor, Integer idSuibject, String modality, String video) {
        super(nombre, lastname, about, education, location, imageProfile, phone, birthDate, registerDate, uId);
        this.idMentor = idMentor;
        this.idSubject = idSuibject;
        this.modality = modality;
        this.video = video;
    }

    public Mentor() {

    }

    public Integer getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(int idMentor) {
        this.idMentor = idMentor;
    }

    public Integer getIdSuibject() {
        return idSubject;
    }

    public void setIdSuibject(int idSuibject) {
        this.idSubject = idSuibject;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "idMentor=" + idMentor +
                ", idSuibject=" + idSubject +
                ", modality='" + modality + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
