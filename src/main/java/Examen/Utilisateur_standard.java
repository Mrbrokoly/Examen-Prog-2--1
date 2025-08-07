package Examen;

import java.time.LocalDate;
import java.util.List;

public class Utilisateur_standard extends Utilisateur {

    public Utilisateur_standard(List<String> publication, String identifiant, String nomUtilisateur, String email, LocalDate date_creation) {
        super(publication, identifiant, nomUtilisateur, email, date_creation);
    }



}