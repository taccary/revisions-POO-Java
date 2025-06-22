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
        return this.nom + " " + this.degats + " " + (this.personnage != null ? this.personnage.getNom() : "null")   
                + "\n";
    }

    public Void setPersonnage(Personnage personnage) {
        // This method seems to be incomplete or not needed in this context.
        // If you want to associate an Arme with a Personnage, you might need to implement it differently.
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
