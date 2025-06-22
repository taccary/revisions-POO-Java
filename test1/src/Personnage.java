public class Personnage {

    private String nom;
    private String couleur;
    private int vie;
    private Arme monArme;

    public Personnage(String nom) {
        this.nom = nom;
        this.couleur = null;
        this.vie = 100;
        this.monArme = null;
    }
    
    public String getNom() {
        return nom;
    }
    public String getCouleur() {
        return couleur;
    }
    public Arme getArme() {
        return monArme;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setArme(Arme arme) {
        this.monArme = arme;
    }
    public boolean jeSuisAffecte() {
        return this.couleur != null;
    }
    public boolean jeSuisVivant() {
        return this.vie > 0;
    }
    public String rencontrer(Personnage autre) {
        System.out.println(autre.toString());
        System.out.println(this.toString());
        if (this.getCouleur() == autre.getCouleur()) {
            return "Salut à toi " + autre.getNom() + " porte toi bien !";
        } else {
            autre.recevoirCoup(this.monArme);
            return autre.getNom() + ", je suis " + this.getNom() + " et je te donne un coup de " + this.monArme.getNom() + " qui te retire " + this.monArme.getDegats() + " vies";
        }
    }

    public void recevoirCoup(Arme a) {
        if (this.jeSuisVivant()) {
            this.vie -= a.getDegats();
            if (this.vie < 0) {
                this.vie = 0; // Assurer que la vie ne tombe pas en dessous de 0
            }
        }
    }
    /**
     * Renvoie une représentation textuelle de l'objet Personnage.
     * Je suis Finrod
     * J'appartiens au camp Bleu
     * Mon arme : Couteau
     * Il me reste 30 vies
     */
    public String toString() {
        return "Je suis " + nom + "\n" +
               "J'appartiens au camp " + (couleur != null ? couleur : "aucun") + "\n" +
               "Mon arme : " + (monArme != null ? monArme.getNom() : "aucune") + "\n" +
               "Il me reste " + vie + " vies";
    }

    public String toLigne() {
        return nom + " " + couleur + " " + (monArme != null ? monArme.getNom() : "aucune") + " " + vie ; 
    }


}
