package jeuconcepts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmeTest {

    @Test
    void testCreationArme() {
        Arme arme = new Arme("Épée", 10);
        assertEquals("Épée", arme.getNom());
        assertEquals(10, arme.getDegats());
        assertFalse(arme.jeSuisAffecte());
    }

    @Test
    void testSetPersonnage() {
        Arme arme = new Arme("Arc", 7);
        Personnage p = new Personnage("Robin");
        arme.setPersonnage(p);
        assertTrue(arme.jeSuisAffecte());
        assertTrue(arme.toLigne().contains("Robin"));
    }

    @Test
    void testEtatInitialNonAffecte() {
        Arme arme = new Arme("Hache", 8);
        assertFalse(arme.jeSuisAffecte());
    }

    @Test
    void testToLigneContientNomEtDegats() {
        Arme arme = new Arme("Dague", 3);
        String ligne = arme.toLigne();
        assertTrue(ligne.contains("Dague"));
        assertTrue(ligne.contains("3"));
    }

    @Test
    void testAffectationMultiplePersonnage() {
        Arme arme = new Arme("Marteau", 15);
        Personnage p1 = new Personnage("Thor");
        Personnage p2 = new Personnage("Loki");
        arme.setPersonnage(p1);
        // Selon la logique métier, on peut tester si le personnage ne change pas ou si une exception est levée
        arme.setPersonnage(p2);
        // Ici, on vérifie que le personnage associé est bien le dernier affecté
        assertTrue(arme.toLigne().contains("Loki"));
    }

    @Test
    void testDegatsNegatifs() {
        Arme arme = new Arme("Fouet", -5);
        // Selon la logique de la classe, adapter ce test :
        // Par exemple, si les dégâts négatifs sont interdits, on peut vérifier la valeur par défaut ou une exception
        assertTrue(arme.getDegats() <= 0);
    }
}
