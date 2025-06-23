public class Arme {

    private String nom;
    private int degats;
    private Personnage personnage;

    public Arme(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
        this.personnage = null; // Initialize personnage to null
    }

    public String getNom() {
        return nom;
    }

    public int getDegats() {
        return degats;
    }

    public String toLigne() {
        return this.nom + " " + this.degats + " " + (this.personnage != null ? this.personnage.getNom() : "null");
    }

    public Void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
        return null;
    }

    public boolean jeSuisAffecte() {
        boolean result = false;
        if (this.personnage != null) {
            result = true;
        }
        return result;
    }

    
}
