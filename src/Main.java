public class Main {
    public static void main(String[] args) {

        Joueur joueur1 = new Joueur("Jean", "Clement", 12);
        Joueur joueur2 = new Joueur("JJ", "DD", 13);

        // Ajout dans la gestion
        Gestion.ajouterUtilisateur(joueur1);
        Gestion.ajouterUtilisateur(joueur2);

        Administrateur admin = new Administrateur("Toto", "Admin", 999);
        Gestion.ajouterUtilisateur(admin);

        // Présentation des joueurs
        joueur1.sePresenter();
        System.out.println("Login : " + joueur1.getLogin());

        // Recherche
        Utilisateur found = Gestion.getUtilisateur(joueur1.getLogin(), joueur1.getMotDePasse());
        System.out.println(found != null ? "Trouvé : " + found.getLogin() : "Introuvable");

        // Ajout dans la liste d’un admin
        admin.ajouterUnJoueur(joueur1);
        admin.ajouterUnJoueur(joueur2);
        admin.presenterLesJoueurs();

        // Vérification responsabilité
        boolean estSousResponsabilite = admin.aSousSaResponsabilite(joueur1);
        System.out.println("Joueur1 est sous la responsabilité de l’admin ? " + estSousResponsabilite);

        // Suppression
        boolean supprime = admin.supprimerUnJoueur(joueur1);
        System.out.println("Suppression de Joueur1 : " + (supprime ? "réussie" : "échouée"));

        admin.presenterLesJoueurs();
    }
}
