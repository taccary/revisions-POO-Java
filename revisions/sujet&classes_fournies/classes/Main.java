package jeuconcepts;

public class Main {
    public static void main(String[] args) {
        //déclaration des variables locales
        Jeu j = new Jeu();
        Personnage p1, p2;

        //On affiche la situation de départ
        System.out.println("---------Situation de départ---------");
        System.out.println(Reservoir.getListeArmes());
        System.out.println(j.getListePersonnages());
        System.out.println("---------Le jeu commence...---------");

        //tant que le jeu n'est pas fini
        while(!j.fini()){
             //Je récupère un personnage
            p1 = j.getUnPersonnage();
            
            //Je récupère un 2ème personnage, autre que p1
            do{
                p2 = j.getUnPersonnage();
            }while(p2 == p1);

            //La rencontre a lieu
            System.out.println(p1.rencontrer(p2));

            //Test si p2 est encore vivant
            if(!p2.jeSuisVivant()){
           //p2 est mort affichage du message et suppression dans la collection
                System.out.println(p2.getNom() + " meurt... et son arme (" + p2.getArme().getNom() + ") est détruite !");
                j.retirer(p2);
            }
            //Affichage de la liste avant la rencontre suivante
            System.out.println(j.getListePersonnages());
        }

        //Le jeu est fini, on affiche le camp gagnant
        p1 = j.getUnPersonnage();
        System.out.println("Le camp " + p1.getCouleur() + " gagne !!");
        System.out.println("---------Fin du jeu...---------");
    }
}
