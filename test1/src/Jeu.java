import java.util.ArrayList;

public class Jeu {

    ArrayList<Personnage> lesPersonnagesEnJeu;

    public Jeu() {
        lesPersonnagesEnJeu = new ArrayList<Personnage>();
        while (lesPersonnagesEnJeu.size() < 11) {
            // on tire au sort un personnage du Reservoir
            int index = (int) (Math.random() * Reservoir.PEUPLE.size());
            // on met la reference de l'objet du reservoir dans la collection 
            Personnage p = Reservoir.PEUPLE.get(index);
            if (!p.jeSuisAffecte()) {
                // on lui affecte aléatoirement une couleur Bleu ou Rouge
                if (Math.random() < 0.5) {
                    p.setCouleur("Bleu");
                } else {
                    p.setCouleur("Rouge");
                }
                
                // on parcours les armes du Reservoir jusqu'a en trouver une qui n'est pas affectée
                while (p.getArme() == null) {
                    int index2 = (int) (Math.random() * Reservoir.ARMURERIE.size());
                    Arme a = Reservoir.ARMURERIE.get(index2);
                    if (!a.jeSuisAffecte()) {
                        p.setArme(a); // On affecte l'arme au personnage
                        a.setPersonnage(p); // On affecte l'arme au personnage                      }
                    }
                }
            }
            lesPersonnagesEnJeu.add(p);
        }
    }

    public String getListePersonnages() {
        String liste = "";
        liste += "Liste des personnages en jeu:\n";
        liste += "-----------------------------\n";
        for (Personnage p : lesPersonnagesEnJeu) {
            liste += p.toLigne() + "\n";
        }
        return liste;
    }

    /**
     * Tire au sort un personnage du jeu depuis la classe Reservoir
     * @return
    */
    public Personnage getUnPersonnage(){
        int index = (int) (Math.random() * lesPersonnagesEnJeu.size());
        return lesPersonnagesEnJeu.get(index);
    }

    public void retirer(Personnage p){
        if(!p.jeSuisVivant()) {
            lesPersonnagesEnJeu.remove(p);
        }
    }

    public boolean fini() {
        boolean res = false;
        if( lesPersonnagesEnJeu.size() == 1) {
            res = true;
        } else {
            int nbBleus = 0;
            int nbRouges = 0;
            for (Personnage p : lesPersonnagesEnJeu) {
                if (p.getCouleur().equals("Bleu")) {
                    nbBleus++;
                } else if (p.getCouleur().equals("Rouge")) {
                    nbRouges++;
                }
            }
            if (nbBleus == 0 || nbRouges == 0) {
                res = true; // Si tous les personnages d'une couleur sont éliminés, le jeu est fini
            }
        }
        return res; // Placeholder return value
    }
    
}
