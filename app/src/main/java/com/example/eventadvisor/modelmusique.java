package com.example.eventadvisor;

public class modelmusique {

    String date,description1,description2,heure,image,tarif,titre, artiste, reserver,lieu;

    public modelmusique() {
    }



    public modelmusique(String date, String description1, String description2, String heure, String image, String tarif, String titre, String artiste, String reserver, String lieu) {
        this.date = date;
        this.description1 = description1;
        this.description2 = description2;
        this.heure = heure;
        this.image = image;
        this.tarif = tarif;
        this.titre = titre;
        this.artiste = artiste;
        this.reserver = reserver;
        this.lieu = lieu;

    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getReserver() {
        return reserver;
    }

    public void setReserver(String reserver) {
        this.reserver = reserver;
    }
}
