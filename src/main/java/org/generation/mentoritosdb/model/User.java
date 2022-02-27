package org.generation.mentoritosdb.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // ayuda a crear la herencia de la clase
public class User {
    private String  name;
    private String lastname;
    private String about;
    private String education;
    private String location;
    private String imageProfile;
    private String phone;
    private String birthdate;
    private String registerdate;
    private String uId;

    public User(String name, String lastname, String about, String education, String location, String imageProfile, String phone, String birthDate, String registerDate, String uId) {
        this.name = name;
        this.lastname = lastname;
        this.about = about;
        this.education = education;
        this.location = location;
        this.imageProfile = imageProfile;
        this.phone = phone;
        this.birthdate = birthDate;
        this.registerdate = registerDate;
        this.uId = uId;
    }

    public User() {
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(String birthDate) {
        this.birthdate = birthDate;
    }

    public String getRegisterDate() {
        return registerdate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerdate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre=" + name +
                ", lastname='" + lastname + '\'' +
                ", about='" + about + '\'' +
                ", education='" + education + '\'' +
                ", location='" + location + '\'' +
                ", imageProfile='" + imageProfile + '\'' +
                ", phone='" + phone + '\'' +
                ", birthDate='" + birthdate + '\'' +
                ", registerDate='" + registerdate + '\'' +
                ", uId='" + uId + '\'' +
                '}';
    }
}
