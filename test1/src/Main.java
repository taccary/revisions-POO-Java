public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arme a1 = new Arme("Epée", 10);
        Arme a2 = new Arme("Arc", 5);
        System.out.println(a1.toLigne());
        System.out.println(a2.toLigne());
        if (a2.jeSuisAffecte()) {
            System.out.println("L'arme " + a2.getNom() + " est affectée.");
        } else {
            System.out.println("L'arme " + a2.getNom() + " n'est pas affectée.");
        }

        Personnage p1 = new Personnage("Jean");
        Personnage p2 = new Personnage("Marie");
        p1.setArme(a1);
        p1.setCouleur("Rouge");
        p2.setArme(a2);
        p2.setCouleur("Bleu");
        a1.setPersonnage(p1);
        a2.setPersonnage(p2);
        System.out.println(p1.toLigne());
        System.out.println(p2.toLigne());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.rencontrer(p2));
        System.out.println(p2.jeSuisVivant());

        
    }
    
}
