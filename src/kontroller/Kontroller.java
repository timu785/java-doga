package kontroller;

import model.Model;
import nezet.Nezet;

public class Kontroller {
    private Model modell;
    private Nezet nezet;
    
    public Kontroller(Model modell, Nezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        nezet.setVisible(true);
        this.feladat();
    }
    
    public void feladat() {
        
    }
}
