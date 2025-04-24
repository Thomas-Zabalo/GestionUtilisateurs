import java.util.ArrayList;
import java.util.List;

public class Administrateur extends Utilisateur {
    private final List<Joueur> lesJoueurs;

    public Administrateur(String nom, String prenom, Integer numero) {
        super(nom, prenom, numero);
        this.lesJoueurs = new ArrayList<>();
    }

    public void presenterLesJoueurs() {
        for (Joueur joueur : lesJoueurs) {
            joueur.sePresenter();
        }
    }

    public boolean ajouterUnJoueur(Joueur joueurAAjouter) {
        if (!lesJoueurs.contains(joueurAAjouter)) {
            lesJoueurs.add(joueurAAjouter);
            return true;
        }
        return false;
    }

    public boolean aSousSaResponsabilite(Joueur joueurATrouver) {
        return lesJoueurs.contains(joueurATrouver);
    }

    public boolean supprimerUnJoueur(Joueur leJoueur) {
        if (lesJoueurs.contains(leJoueur)) {
            lesJoueurs.remove(leJoueur);
            return true;
        }
        return false;
    }

}
