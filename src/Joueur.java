public class Joueur extends Utilisateur {
    private final int score;

    public Joueur(String nom, String prenom, Integer numero) {
        super(nom, prenom, numero);
        this.score = 10;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.println("Score : " + score);
    }


}
