package Examen;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class Utilisateur {
    private String identifiant;
    private String nomUtilisateur;
    private String email;
    private List<String> publication;
    private LocalDate Date_creation;

    public List<String> getPublication() {
        return publication;
    }

    public void setPublication(List<String> publication) {
        this.publication = publication;
    }







    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public LocalDate getDate_creation() {
        return Date_creation;
    }

    public void setDate_creation(LocalDate date_creation) {
        Date_creation = date_creation;
    }

    public Utilisateur( List<String> publication,String identifiant, String nomUtilisateur,String email, LocalDate date_creation) {
        this.publication = publication;
        this.email = email;
        this.identifiant = identifiant;
        this.nomUtilisateur = nomUtilisateur;
        this.Date_creation = LocalDate.of(2025,8,07);

    }

    public String createPublication(String publication_contenu){
        if (publication_contenu != null) {
            publication.add(publication_contenu);
            System.out.println("Publication crée");

            return publication_contenu;
        }

        else {
            return "error";

        }

    }
    public String makeCommentaire(String commentaire_contenu){
        if (commentaire_contenu != null) {System.out.println("Vouz aver commenter une" + getPublication());
            return commentaire_contenu;
        }

        else {
            return "error";

        }

    }








}




