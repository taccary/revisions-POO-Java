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
}
