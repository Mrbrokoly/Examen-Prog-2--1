package Examen;

import java.time.LocalDate;
import java.util.List;

public class moderateurs extends Utilisateur{

    public moderateurs(List<String> publication, String identifiant, String nomUtilisateur, String email, LocalDate date_creation) {
        super(publication, identifiant, nomUtilisateur, email, date_creation);
    }
    public String remove_commentaire() {

    }

    public String remove_publication() {

    }
}

