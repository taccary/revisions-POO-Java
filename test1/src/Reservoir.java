import java.util.ArrayList;

public class Reservoir {
    public final static ArrayList<Arme> ARMURERIE = new ArrayList(){
        {add(new Arme("Katana",100));
        add(new Arme("Epée",90));    
        add(new Arme("Hache",80));
        add(new Arme("Massue",70));   
        add(new Arme("Sabre",60));
        add(new Arme("Glaive",50));   
        add(new Arme("Dague",40));
        add(new Arme("Couteau",30));   
        add(new Arme("Canif",20));
        add(new Arme("Fronde",10));           
        }
    };
    
    public static String getListeArmes(){
        String res ="\nListe des armes en jeu";
        res = res + "\n------------------------------------------";
        for(Arme a : Reservoir.ARMURERIE){
            res = res + "\n" + a.toLigne();
        }
        res = res + "\n------------------------------------------";        
        return res;
    }   
    
     public final static ArrayList<Personnage> PEUPLE = new ArrayList(){
        {add(new Personnage("Azog"));
        add(new Personnage("Gimli"));    
        add(new Personnage("Beorn"));
        add(new Personnage("Aldor"));   
        add(new Personnage("Tarcil"));
        add(new Personnage("Haldar"));   
        add(new Personnage("Fosco"));
        add(new Personnage("Elwind"));   
        add(new Personnage("Mahtan"));
        add(new Personnage("Finrod"));           
        }
    };  
    
    
}
