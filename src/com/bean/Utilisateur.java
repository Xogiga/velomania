package com.bean;

public class Utilisateur {

    private String email;
    private String motDePasse;
    private String nom;

    public Utilisateur(String em, String mdp, String n){
        email = em;
        motDePasse = mdp;
        nom = n;
    }

    public Utilisateur (String em, String mdp){
        email = em;
        motDePasse = mdp;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {

        return email;
    }

    public void setMotDePasse(String motDePasse) {

        this.motDePasse = motDePasse;
    }

    public String getMotDePasse() {

        return motDePasse;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getNom() {

        return nom;
    }
}