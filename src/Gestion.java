import java.util.ArrayList;
import java.util.List;

public class Gestion {
    private final static List<Utilisateur> utilisateurs = new ArrayList<>();

    public static Utilisateur getUtilisateur(String login, String motDePasse) {
        for (Utilisateur utilisateur : utilisateurs) {
            if (utilisateur.getLogin().equals(login) && utilisateur.getMotDePasse().equals(motDePasse)) {
                return utilisateur;
            }
        }
        return null;
    }

    public static void ajouterUtilisateur(Utilisateur joueur) {
        utilisateurs.add(joueur);
    }
}
