public class Utilisateur {
    protected String nom;
    protected String prenom;
    protected Integer numero;
    protected String motDePasse;

    public Utilisateur(String nom, String prenom, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.motDePasse = getLogin();
    }

    public void sePresenter() {
        System.out.println(nom + " " + prenom + " " + numero);
    }

    public String getLogin() {
        String sixCharacter = nom.length() >= 6 ? nom.substring(0, 6) : nom;
        return sixCharacter.toUpperCase() + prenom.substring(0, 1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numero=" + numero +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }

    public String getMotDePasse() {
        return motDePasse;
    }
}
