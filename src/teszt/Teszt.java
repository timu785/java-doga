package teszt;

import model.LampaModel;
import model.Model;

public class Teszt {
    public static void main(String[] args) {  
        // tesztek
        tesztLampaModelKapcsolas();
        tesztModelInicializalas();
    }

    public static void tesztLampaModelKapcsolas() {
        LampaModel lampamodel = new LampaModel();
        
        boolean eredeti = lampamodel.getFelkapcsolva();
        lampamodel.kapcsol();
        boolean kapcsolt = lampamodel.getFelkapcsolva();
        
        assert eredeti != kapcsolt : "HIBA: a lámpa kapcsolás nem működik megfelelően!";
        
        System.out.println("tesztLampaModelKapcsolas() sikeresen lefutott");
    }
    
    public static void tesztModelInicializalas() {
        Model model = new Model();
        
        assert model.getLampak().size() == 9 : "HIBA: nem 9 lámpa jött létre!";
        
        System.out.println("tesztModelInicializalas() sikeresen lefutott");
    }
}