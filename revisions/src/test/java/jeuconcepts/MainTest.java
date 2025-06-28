package jeuconcepts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    void testMainAffichageBienvenue() {
        // Redirige la sortie standard
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Appel du main
        Main.main(new String[]{});

        // Restaure la sortie standard
        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("Bienvenue dans Jeu de concepts version 1.0!"),
            "Le message de bienvenue doit être affiché");
    }
}
